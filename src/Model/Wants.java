/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Wants {
    
    private int C_SSN;
    private String Option;
    
    public Wants(){}
    
    public Wants(Customers C, PaymentMethod PM ){
        this.C_SSN = C.getC_SSN();
        this.Option = PM.getOption();
    }
}
