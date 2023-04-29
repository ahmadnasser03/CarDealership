/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Cars;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmadnasser
 */
public class CarControl extends AbstractControl {
    
    public CarControl(){
        super();
    }
    
    public Cars getCarByVehicleNumber(int number){
        Cars car = null;
        String query = String.format("SELECT * FROM cars WHERE vehicleNumber = %d",number);
        try {
            ResultSet rs = con.createStatement().executeQuery(query);
            rs.next();
            car = new Cars(rs.getString("VehicleNumber"),
            rs.getString("Model"),
            rs.getString("Make"),
            rs.getInt("Year"),
            rs.getInt("Price"));
        } catch(Exception e){}
        
        return car;
    }
    
    public List<Cars> getAllCars(){
        
        List<Cars> cars = new ArrayList<>();
        try {
            
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM car");
            while (rs.next()){
                Cars car = new Cars(rs.getString("VehicleNumber"),
            rs.getString("Model"),
            rs.getString("Make"),
            rs.getInt("Year"),
            rs.getInt("Price"));
                cars.add(car);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cars;
    }
}
