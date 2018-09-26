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
public class OddEvenByTernaryOperator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=s.nextInt();
        System.out.println((number%2==0) ? " Number is even": " Number is odd");
    }
}
