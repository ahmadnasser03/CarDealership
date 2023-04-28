/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.PaymentMethod;
import java.sql.*;
/**
 *
 * @author ahmadnasser
 */
public class PaymentMethodControl extends AbstractControl {
    
    public PaymentMethodControl(){
        super();
    }
    
    public PaymentMethod getPaymentMethodByOption(String option){
        
        PaymentMethod pm = null;
        
        try {
            
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM paymentmethod WHERE Option = '" + option+"'");
            rs.next();
            pm = new PaymentMethod(rs.getString("Option"));
            
        } catch(Exception e){
        e.printStackTrace();
        }
        
        return pm;
    }
}
