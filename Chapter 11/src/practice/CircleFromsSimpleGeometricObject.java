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
public class CircleFromsSimpleGeometricObject extends SimpleGeometricObject {

    private double radious;

    public CircleFromsSimpleGeometricObject() {

    }

    public CircleFromsSimpleGeometricObject(double radious) {
        this.radious = radious;
    }

    public CircleFromsSimpleGeometricObject(double radious, boolean filled, Date dateCreated) {
        super(filled, dateCreated);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return radious * radious * Math.PI;
    }

    public double getDiameter() {
        return 2 * radious;
    }

    public double getPerimeter() {
        return 2 * radious * Math.PI;
    }
public void printCircle(){
    System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radious);
}
}
