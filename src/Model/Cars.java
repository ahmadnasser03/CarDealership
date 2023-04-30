/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Cars {
    private String VehicleNumber;
    private String Model;
    private String Make;
    private int Year, Price;
    
   public Cars(){}
   
   public Cars(String VehicleNumber, String Model, String Make, int Year, int Price ){
       this.VehicleNumber= VehicleNumber;
       this.Model= Model;
       this.Make= Make;
       this.Year= Year;
       this.Price = Price;
   }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return "Cars{" + "VehicleNumber=" + VehicleNumber + ", Model=" + Model + ", Make=" + Make + ", Year=" + Year + ", Price=" + Price + '}';
    }
}
    

