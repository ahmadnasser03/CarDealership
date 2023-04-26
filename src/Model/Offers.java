/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Offers {
    private String VehicleNumber;
    private int SP_SSN;

    public Offers() {
    }

    public Offers(Cars c, SalesPerson sp) {
        this.VehicleNumber = c.getVehicleNumber();
        this.SP_SSN = sp.getSP_SSN();
    }
    
    
    
}
