/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Customers {
    private int C_SSN;
    private String C_FirstName;
    private String C_LastName;
    private int C_PhoneNumber;
    private String C_Email;
    
    public Customers(){}
    
    public Customers(int C_SSN, String C_FirstName, String C_LastName, int C_PhoneNumber,String C_Email){
        this.C_SSN=C_SSN;
        this.C_FirstName= C_FirstName;
        this.C_LastName=C_LastName;
        this.C_PhoneNumber=C_PhoneNumber;
        this.C_Email = C_Email;
    
    
    }

    public int getC_SSN() {
        return C_SSN;
    }

    public void setC_SSN(int C_SSN) {
        this.C_SSN = C_SSN;
    }

    public String getC_FirstName() {
        return C_FirstName;
    }

    public void setC_FirstName(String C_FirstName) {
        this.C_FirstName = C_FirstName;
    }

    public String getC_LastName() {
        return C_LastName;
    }

    public void setC_LastName(String C_LastName) {
        this.C_LastName = C_LastName;
    }

    public int getC_PhoneNumber() {
        return C_PhoneNumber;
    }

    public void setC_PhoneNumber(int C_PhoneNumber) {
        this.C_PhoneNumber = C_PhoneNumber;
    }

    public String getC_Email() {
        return C_Email;
    }

    public void setC_Email(String C_Email) {
        this.C_Email = C_Email;
    }
    
    
}
