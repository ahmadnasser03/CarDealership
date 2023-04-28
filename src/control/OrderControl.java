/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Cars;
import Model.Customers;
import Model.Order;
import Model.PaymentMethod;
import Model.SalesPerson;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmadnasser
 */
public class OrderControl extends AbstractControl {

    private CarControl carCtrl;
    private CustomerControl customerCtrl;
    private SalesPersonControl SPC;
    private PaymentMethodControl PMC;

    public OrderControl() {
        super();
        carCtrl = new CarControl();
        customerCtrl = new CustomerControl();
        SPC = new SalesPersonControl();
        PMC = new PaymentMethodControl();
    }

    public Order getOrderByID(int id) {

        Order order = null;
        String query = String.format("SELECT * FROM orders WHERE OrderID = %d", id);
        try {
            ResultSet rs = con.createStatement().executeQuery(query);
            Cars car = carCtrl.getCarByVehicleNumber(rs.getInt("VehicleNumber"));
            SalesPerson SP = SPC.getSalesPersonBySSN(rs.getInt("SP_SSN"));
            Customers C = customerCtrl.getCustomerBySSN(rs.getInt("C_SSN"));
            PaymentMethod pm = PMC.getPaymentMethodByOption(rs.getString("Option"));

            rs.next();
            order = new Order(rs.getInt("OrderID"),
                    rs.getString("OrderDate"),
                    car,
                    rs.getInt("CommissionRate"),
                    SP,
                    pm,
                    C);
        } catch (Exception e) {
        }
        return order;
    }

    public boolean order(Order o) {

        String date = o.getOrderDate(), vehicleNumber = o.getVehicleNumber(), option = o.getOption();
        int c_ssn = o.getC_SSN(), commissionRate = o.getCommisionRate(), s_ssn = o.getSP_SSN(), id = o.getOrderID();
        int rows = 0;
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO orders VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setInt(4, commissionRate);
            ps.setInt(5, s_ssn);
            ps.setInt(7, c_ssn);
            ps.setString(2, date);
            ps.setString(3, vehicleNumber);
            ps.setString(6, option);
            rows = ps.executeUpdate();

        } catch (Exception e) {
        }

        return rows == 1;
    }

    public List<Order> getAllOrders() {

        List<Order> orders = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM orders");
            while (rs.next()) {
                Cars car = carCtrl.getCarByVehicleNumber(rs.getInt("VehicleNumber"));
                SalesPerson SP = SPC.getSalesPersonBySSN(rs.getInt("SP_SSN"));
                Customers C = customerCtrl.getCustomerBySSN(rs.getInt("C_SSN"));
                PaymentMethod pm = PMC.getPaymentMethodByOption(rs.getString("Option"));
                Order order = new Order(rs.getInt("OrderID"),
                        rs.getString("OrderDate"),
                        car,
                        rs.getInt("CommissionRate"),
                        SP,
                        pm,
                        C);
                orders.add(order);
            }
        } catch (Exception e){}
        
        return orders;
    }
}
