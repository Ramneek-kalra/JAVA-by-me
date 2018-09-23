/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ex1 {
static String str="TEN";
    public static void main(String[] args) {
        System.out.println("111111");
        //System.out.println(10/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        try {
            System.out.println(10/0);
            System.out.println(10/2);
            System.out.println(Integer.parseInt("ten"));
        } catch (Exception e) {
            System.out.println("10 does not devide by 0");
        }
    }
    
    
}
