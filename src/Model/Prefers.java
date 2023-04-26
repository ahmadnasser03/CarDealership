/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Prefers {
    
    private int C_SSN;
    private String VehicleNumber;
    
    public Prefers(){}
    
    public Prefers(Customers C, Cars c){
        
        this.C_SSN = C.getC_SSN();
        this.VehicleNumber = c.getVehicleNumber();
    }
}
