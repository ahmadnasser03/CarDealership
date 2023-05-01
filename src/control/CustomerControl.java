/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Customers;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmadnasser
 */
public class CustomerControl extends AbstractControl {

    public CustomerControl() {
        super();
    }

    public int addCustomer(Customers customer) {
        String query = "INSERT INTO customers VALUES(?,?,?,?,?)";
        int status = -1;
        if (con == null) {
            return status;
        }
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, customer.getC_SSN());
            ps.setString(4, customer.getC_FirstName());
            ps.setString(5, customer.getC_LastName());
            ps.setInt(3, customer.getC_PhoneNumber());
            ps.setString(2, customer.getC_Email());

            int rows = ps.executeUpdate();

            status = rows == 1 ? 0 : -1;
            System.out.println(rows + " rows affected");
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
            if (ee.getMessage().equals("CONSTRAINT `email_format` failed for `cardealership`.`customers`")) {
                status = 1;
            } else {
                status = 2;
            }
        }
        return status;
    }

    public Customers getCustomerBySSN(int ssn) throws NullPointerException {

        Customers customer = null;
        if (con == null)
            throw new NullPointerException();
        String query = String.format("SELECT * FROM customers WHERE C_SSN = %d", ssn);
        try {
            ResultSet rs = con.createStatement().executeQuery(query);
            rs.next();
            customer = new Customers(rs.getInt("C_SSN"),
                    rs.getString("C_FirstName"),
                    rs.getString("C_LastName"),
                    rs.getInt("C_PhoneNumber"),
                    rs.getString("C_Email"));

        } catch (Exception e) {
        }

        return customer;
    }

    public List<Customers> getAllCustomers() {

        List<Customers> customers = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM customers");
            while (rs.next()) {
                Customers customer = new Customers(rs.getInt("C_SSN"),
                        rs.getString("C_FirstName"),
                        rs.getString("C_LastName"),
                        rs.getInt("C_PhoneNumber"),
                        rs.getString("C_Email"));
                customers.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    public int C_UpdateMyInfo(Customers C) {

        System.out.println(C.getC_SSN());
        String query = String.format("UPDATE Customers SET C_FirstName = '%s', C_LastName = '%s', C_PhoneNumber = %d, C_Email = '%s'"
                + " WHERE C_SSN = %d",
                C.getC_FirstName(), C.getC_LastName(), C.getC_PhoneNumber(), C.getC_Email(),
                C.getC_SSN());
        System.out.println(query);
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
            return 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 1;
        }
    }

    public void deleteCustomer(Customers C) {
        String query = "DELETE FROM Customers where C_ssn=" + C.getC_SSN();
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
