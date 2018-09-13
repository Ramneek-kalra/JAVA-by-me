/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConcatEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter values");
        String s1=sc.nextLine();
           String s2=sc.nextLine();
              String s3=sc.nextLine();
              String s4=s1+s2+s3;
              System.out.println("3 String: "+s1.concat(s2).concat(s3).concat(s4));
               System.out.println("s4: "+s4);
    }
    
}
