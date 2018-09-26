/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.eat();
        Cat cat= new Cat();
        cat.eat();
        
        Object[] obj={new Dog(), new Cat()};
        for(int i=0;i<obj.length; i++){
            if(obj[i] instanceof Animal){
                System.out.println(((Animal) obj[i]).eat());
            }
        }
        
    }
}
