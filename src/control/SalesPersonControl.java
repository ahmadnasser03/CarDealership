/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.SalesPerson;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmadnasser
 */
public class SalesPersonControl extends AbstractControl {

    public SalesPersonControl() {
        super();
    }

    public int addSalesPerson(SalesPerson SP) {

        String query = "INSERT INTO salesperson VALUES(?,?,?,?,?,?)";

        int status = -1;
        if (con == null) {
            return status;
        }
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, SP.getSP_SSN());
            ps.setString(2, SP.getSP_FirstName());
            ps.setString(3, SP.getSP_LastName());
            ps.setInt(4, SP.getSP_PhoneNumber());
            ps.setString(5, SP.getSP_Email());
            ps.setInt(6, SP.getYearsOfExperience());

            int rows = ps.executeUpdate();
            status = rows == 1 ? 0 : -1;
        } catch (Exception e) {
            if (e.getMessage().equals("CONSTRAINT `ck_salesperson_email_format` failed for `cardealership`.`salesperson`")) {
                status = 1;
            } else {
                status = 2;
            }

        }
        return status;
    }

    public SalesPerson getSalesPersonBySSN(int ssn) throws NullPointerException {

        SalesPerson SP = null;
        if (con == null) {
            throw new NullPointerException();
        }

        String query = String.format("SELECT * FROM salesperson WHERE SP_SSN = %d", ssn);
        try {
            ResultSet rs = con.createStatement().executeQuery(query);
            rs.next();
            SP = new SalesPerson(rs.getInt("SP_SSN"),
                    rs.getString("SP_FirstName"),
                    rs.getString("SP_Lastname"),
                    rs.getInt("SP_PhoneNumber"),
                    rs.getString("SP_Email"),
                    rs.getInt("YearsOfExperience"));
            System.out.println("control.SalesPersonControl.getSalesPersonBySSN()");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return SP;
    }

    public int S_UpdateMyInfo(SalesPerson sp) {

        System.out.println(sp.getSP_SSN());
        String query = String.format("UPDATE SalesPerson SET SP_FirstName = '%s', SP_LastName = '%s', SP_PhoneNumber = %d, SP_Email = '%s'"
                + ", YearsOfExperience = %d WHERE SP_SSN = %d",
                sp.getSP_FirstName(), sp.getSP_LastName(), sp.getSP_PhoneNumber(), sp.getSP_Email(),
                sp.getYearsOfExperience(),
                sp.getSP_SSN());
        try {

            Statement stm = con.createStatement();
            int rows = stm.executeUpdate(query);
            stm.close();
        } catch (SQLException ex) {
            return 1;
        }
        return 0;
    }

    public void deleteMyAccount(SalesPerson sp) {
        String query = "DELETE FROM SalesPerson where SP_SSN=" + sp.getSP_SSN();
        try {
            Statement stm1 = con.createStatement();
            stm1.executeUpdate(query);
            stm1.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<SalesPerson> getAllSalesPeople() {

        List<SalesPerson> salesPeople = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM salesperson");
            while (rs.next()) {
                SalesPerson SP = new SalesPerson(rs.getInt("SP_SSN"),
                        rs.getString("SP_FirstName"),
                        rs.getString("SP_Lastname"),
                        rs.getInt("SP_PhoneNumber"),
                        rs.getString("SP_Email"),
                        rs.getInt("YearsOfExperience"));
                salesPeople.add(SP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return salesPeople;
    }
}
