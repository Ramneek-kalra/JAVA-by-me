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
public class SumExitZeroScanner {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
       int n=0;
       do{
           n=sc.nextInt();
           sum+=n;
       }while(n !=0);
      // sum+=-5;
               System.out.println("Sum: "+sum);
    }
}
