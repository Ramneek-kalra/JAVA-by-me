/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class FormattingConsoleOutput {
    public static void main(String[] args) {
        double amount=12618.98;
        double interestRate = 0.0013;
        double interest =amount * interestRate;
        System.out.println("Interest is: "+interest);
        
        double amount1=12618.98;
        double interestRate1 = 0.0013;
        double interest1 =Math .round(amount1 * interestRate1);
        System.out.println("Interest is: "+interest1);
        
         double amount3=12618.98;
        double interestRate3 = 0.0013;
        double interest3 =amount3 * interestRate3;
        System.out.printf("Interest is: "+interest3);
         
    }
}
