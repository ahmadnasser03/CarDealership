/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class SalesPerson {
    private int SP_SSN, SP_PhoneNumber;
    private String SP_FirstName, SP_LastName, SP_Email, YearsOfExperience;
    
    public SalesPerson(){}
    
    public SalesPerson(int SP_SSN, int SP_PhoneNumber, String SP_FirstName, String SP_LastName, String SP_Email, String YearsOfExperience) {
        this.SP_SSN = SP_SSN;
        this.SP_PhoneNumber = SP_PhoneNumber;
        this.SP_FirstName = SP_FirstName;
        this.SP_LastName = SP_LastName;
        this.SP_Email = SP_Email;
        this.YearsOfExperience = YearsOfExperience;
        
    }

    public int getSP_SSN() {
        return SP_SSN;
    }

    public void setSP_SSN(int SP_SSN) {
        this.SP_SSN = SP_SSN;
    }

    public int getSP_PhoneNumber() {
        return SP_PhoneNumber;
    }

    public void setSP_PhoneNumber(int SP_PhoneNumber) {
        this.SP_PhoneNumber = SP_PhoneNumber;
    }

    public String getSP_FirstName() {
        return SP_FirstName;
    }

    public void setSP_FirstName(String SP_FirstName) {
        this.SP_FirstName = SP_FirstName;
    }

    public String getSP_LastName() {
        return SP_LastName;
    }

    public void setSP_LastName(String SP_LastName) {
        this.SP_LastName = SP_LastName;
    }

    public String getSP_Email() {
        return SP_Email;
    }

    public void setSP_Email(String SP_Email) {
        this.SP_Email = SP_Email;
    }

    public String getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(String YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }
}
