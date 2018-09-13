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
public class PassFail {

    static int obtainMark;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        obtainMark = sc.nextInt();
        if (obtainMark>=70 && obtainMark <80){
            System.out.println("Grade A");
        }else if (obtainMark>=80 && obtainMark <=100){
            System.out.println("Grade A+");
        }else if (obtainMark>=0 && obtainMark <70){
            System.out.println("Grade F");
        }else{
            System.out.println("Invalid Number");
        }



    }

}
