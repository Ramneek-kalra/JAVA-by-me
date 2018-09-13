/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TurnaryOperatorEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println((num%2==0)?"Num is Even" : "Num is Odd");   //here ':' is Conditional expression 
    }                                                                  // here '?' is Turnary Operator
}
