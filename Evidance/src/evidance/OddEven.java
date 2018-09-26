/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OddEven {
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
        System.out.println("Enter begining number: ");
        int num1=n.nextInt();
         System.out.println("Enter ending number: ");
        int num2=n.nextInt();
        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                System.out.println(i+" is even number");
            }else{
                System.out.println(i+" is odd number");
            }
        }
        
    }
}
