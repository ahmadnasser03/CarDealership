/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.*;

/**
 *
 * @author ahmadnasser
 */
public abstract class AbstractControl {

    private String url = "jdbc:mysql://localhost:3308/cardealership?useSSL=false",
            user = "root",
            pass = "";
    protected Connection con;

    public AbstractControl() {

        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
