package com.mycompany.powersocketadapter;


import com.mycompany.powersocketadapter.AmericanPlug;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jesusalvarado
 */
public class American110vAppliancePlug implements AmericanPlug{

    @Override
    public void givePower() {
       System.out.println("This is a 110v plug. "+ convertPower());
    }
    
    private String convertPower(){
    
    return "Converted power from 110v to 230v";
    }
    
}
