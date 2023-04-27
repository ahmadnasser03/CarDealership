/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Customers;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.*;

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
        } catch(Exception e){
            
        }
        return rows == 1;
    }

}