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

    public boolean addCustomer(Customers customer) {
        String query = "INSERT INTO customers VALUES(?,?,?,?,?)";
        int rows = 0;
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, customer.getC_SSN());
            ps.setString(4, customer.getC_FirstName());
            ps.setString(5, customer.getC_LastName());
            ps.setInt(3, customer.getC_PhoneNumber());
            ps.setString(2, customer.getC_Email());

            rows = ps.executeUpdate();

            System.out.println(rows + " rows affected");
        } catch (Exception e) {

        }
        return rows == 1;
    }

    public Customers getCustomerBySSN(int ssn) {

        Customers customer = null;
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
     public void C_UpdateMyInfo(Customers C)
    {
        
       String query="UPDATE customers SET C_FirstName='"+C.getC_FirstName()+"', C_LastName ='"+C.getC_LastName()+"',C_PhoneNumber='"+C.getC_PhoneNumber()+"', C_Email='"+C.getC_Email()+"' WHERE C_SSN='"+C.getC_SSN()+"'";
        try{
          
        Statement statement = con.createStatement();
        statement.executeUpdate(query);
        
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
