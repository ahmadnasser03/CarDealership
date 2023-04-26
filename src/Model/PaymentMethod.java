/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author lara.tawbeh
 */
public class PaymentMethod {
    private String Option;

    public PaymentMethod(){}
    
    public PaymentMethod(String Option) {
        this.Option = Option;
    }

    public String getOption() {
        return Option;
    }

    public void setOption(String Option) {
        this.Option = Option;
    }
    
}
