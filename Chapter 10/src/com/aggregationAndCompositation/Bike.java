/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aggregationAndCompositation;

/**
 *
 * @author User
 */
public class Bike {
    private String color;
    private int maxspeed;

    public void bikeInfo() {
        System.out.println("Color: "+color+"Max Speed: "+maxspeed);
    }
           
           
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }
    
}
