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
    private int CommisionRate;
    private int SP_SSN;
    private String Option;
    private int C_SSN;

    public Order() {
    }

    public Order(int OrderID, String OrderDate, Cars c, int CommisionRate, SalesPerson sp, PaymentMethod pm, Customers C) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.VehicleNumber = c.getVehicleNumber();
        this.CommisionRate = CommisionRate;
        this.SP_SSN = sp.getSP_SSN();
        this.Option = pm.getOption();
        this.C_SSN = C.getC_SSN();
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public int getCommisionRate() {
        return CommisionRate;
    }

    public void setCommisionRate(int CommisionRate) {
        this.CommisionRate = CommisionRate;
    }

    public int getSP_SSN() {
        return SP_SSN;
    }

    public void setSP_SSN(int SP_SSN) {
        this.SP_SSN = SP_SSN;
    }

    public String getOption() {
        return Option;
    }

    public void setOption(String Option) {
        this.Option = Option;
    }

    public int getC_SSN() {
        return C_SSN;
    }

    public void setC_SSN(int C_SSN) {
        this.C_SSN = C_SSN;
    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", VehicleNumber=" + VehicleNumber + ", CommisionRate=" + CommisionRate + ", SP_SSN=" + SP_SSN + ", Option=" + Option + ", C_SSN=" + C_SSN + '}';
    }
    
   
    
}
