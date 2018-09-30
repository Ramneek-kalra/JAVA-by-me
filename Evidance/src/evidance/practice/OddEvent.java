/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance.practice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OddEvent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         isOddEven(sc.nextInt()) ;
            
            
            
        }
    static void isOddEven(int num){
        if(num % 2==0){
            System.out.println(num+" is even");
        }else {
            System.out.println(num+" is odd");
        }
    }
            
}
