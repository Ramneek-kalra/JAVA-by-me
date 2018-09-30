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
public class LargestNUmber {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         isLargestNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());
           
        }
     
     static void isLargestNumber(int n1,int n2, int n3){
         if(n1>n2 && n1>n3){
             System.out.println(n1+" is largest");
         }else if(n2>n1 && n2>n3){
             System.out.println(n2+" is largest");
         }if(n3>n2 && n3>n1){
             System.out.println(n3+" is largest");
         }
     }
}
