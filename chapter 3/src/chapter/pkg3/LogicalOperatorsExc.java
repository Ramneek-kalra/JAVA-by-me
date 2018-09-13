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
public class LogicalOperatorsExc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
int num=sc.nextInt();
if (num%2==0 && num%3==0){
    System.out.println("yes");
}else{
   System.out.println("no"); 
}
if (num%2==0 || num%3==0){
    System.out.println("yes 2");
}else{
   System.out.println("no 2"); 
}
if (num%2==0 ^ num%3==0){
    System.out.println("yes 3");
}else{
   System.out.println("no 3"); 
}

    }
}
