/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class Accepts {
    
    private int SP_SSN;
    private String Option;
    //hi
    public Accepts(){}
    
    public Accepts(SalesPerson SP, PaymentMethod pm){
        this.SP_SSN = SP.getSP_SSN();
        this.Option = pm.getOption();
    }
    //test
    //test2
}
