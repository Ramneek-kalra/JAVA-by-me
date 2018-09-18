/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sum {

    public static void main(String[] args) {
        Sum m = new Sum();
      // int rs = m.addition();
        //System.out.println("Reasult of Sum is: " + rs); 
        int er=m.makeSum(15, 1);
        System.out.println("sum of "+er);
    }

    /*public int addition() {
        Scanner n = new Scanner(System.in);
        System.out.println("inter first number: ");

        int first = n.nextInt();
        System.out.println("inter last number: ");
        int last = n.nextInt();
        int sum = first + last;
        return sum;
    }*/
    public int makeSum(int n1,int n2){
       int sum=0;
        if(n1>0 && n2>0){
            if(n1>n2){
                for(int n)
              // sum= n1-n2;
            }else if(n1<n2){
              // sum= n1+n2;
            }else if(n1==n2){
                sum=n1;
            }
        }else{
            sum=-1;
        }
        return sum;
    }
}
