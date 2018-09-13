/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class StringLength {
    public static void main(String[] args) {
        String message="Welcome to java";
        System.out.println("The length of "+message+"is "+message.length());
        System.out.println("The length of "+message+"is "+message.charAt(5));
        System.out.println("The length of "+message+" is "+message.trim());
        
                String message2="USA";
                  System.out.println(message.concat(message2).toLowerCase());
    }
}
