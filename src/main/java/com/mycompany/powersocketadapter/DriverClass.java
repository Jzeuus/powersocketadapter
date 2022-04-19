/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * add the AMerican110Plug, show use, use it with a European, need an additional method,to convert
 * to 220 from 110
 * 
 * @author MoaathAlrajab
 */
public class DriverClass {
    
    public static void main(String[] args) {
        
        AmericanPlug usaPlug = new American110vAppliancePlug();
        
        EuropeanPowerSocket eSocket= new EuropeanPowerSocket();
        EuropeanPlug ePlug= new AmericanToEuropeanPlugAdapter(usaPlug);
        
        eSocket.plugIn(ePlug);
    }
    
}
