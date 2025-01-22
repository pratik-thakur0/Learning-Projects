/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn.spring;

/**
 *
 * @author pratik
 */
public class OrderMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Wakeup to the Reality";
    }
    
    
}
