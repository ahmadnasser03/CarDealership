/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Order {
    private int OrderID;
    private String OrderDate;
    private String VehicleNumber;
    private int Price;
    private int CommisionRate;
    private int SP_SSN;
    private String Option;
    private int C_SSN;
    private double Earnings;

    public Order() {
    }

    public Order(int OrderID, String OrderDate, Cars c, int Price, int CommisionRate, SalesPerson sp, PaymentMethod pm, Customers C, double Earnings) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.VehicleNumber = c.getVehicleNumber();
        this.Price = Price;
        this.CommisionRate = CommisionRate;
        this.SP_SSN = sp.getSP_SSN();
        this.Option = pm.getOption();
        this.C_SSN = C.getC_SSN();
        this.Earnings = Earnings;
    }
    
    
    
}
