package com.INhretentEx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class C extends B {

    String department;

    public C() {
    }

    public C(String department) {
        this.department = department;
    }

    public C(String department, double salary) {
        super(salary);
        this.department = department;
    }

    public C(String department, double salary, int id, String name, String color) {
        super(salary, id, name, color);
        this.department = department;
    }

}
