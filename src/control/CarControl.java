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
            
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM cars");
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
    
    public List<Cars> getAllCarsWithMake(String make){
        
        if (make.equals(""))
            return getAllCars();
        List<Cars> cars = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM cars WHERE make='" + make + "'");
            while(rs.next()){
                Cars car = new Cars(rs.getString("VehicleNumber"),
            rs.getString("Model"),
            rs.getString("Make"),
            rs.getInt("Year"),
            rs.getInt("Price"));
                cars.add(car);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return cars;
    }
    
    public List<Cars> getAllCarsWithModel(String model){
        
        if (model.equals(""))
            return getAllCars();
        List<Cars> cars = new ArrayList<>();
        try {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM cars WHERE model='" + model + "'");
            while(rs.next()){
                Cars car = new Cars(rs.getString("VehicleNumber"),
            rs.getString("Model"),
            rs.getString("Make"),
            rs.getInt("Year"),
            rs.getInt("Price"));
                cars.add(car);
            }
        } catch (Exception e){
            e.printStackTrace();
        } 
        return cars;
    }
    
    public List<String> getAllModels(){
        
        List<String> models = new ArrayList<>();
        try {
           ResultSet rs = con.createStatement().executeQuery("SELECT DISTINCT Model FROM cars" );
           while (rs.next()){
               models.add(rs.getString("Model"));
           }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return models;
    }
    
    public List<String> getAllMakes(){
        
        List<String> makes = new ArrayList<>();
        try {
           ResultSet rs = con.createStatement().executeQuery("SELECT DISTINCT Make FROM cars" );
           while (rs.next()){
               makes.add(rs.getString("Make"));
           }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        return makes;
    }
}
