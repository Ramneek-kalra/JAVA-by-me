/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Date;

/**
 *
 * @author User
 */
public class SimpleGeometricObject {
    private String color="white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public SimpleGeometricObject(){
        dateCreated=new java.util.Date(); 
    }

    public SimpleGeometricObject(boolean filled, Date dateCreated) {
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setfilled(String color) {
        this.filled = filled;
    }
   
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "SimpleGeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    
}
