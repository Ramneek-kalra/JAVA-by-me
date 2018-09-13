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
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner ac= new Scanner(System.in);
        System.out.println("Enter an input: ");
        int status= ac.nextInt();
        switch (status){
            case 0:
                System.out.println("000000");
                break;      //break use to end a case
                case 1:
                System.out.println("111111");
                break;
                case 2:
                System.out.println("222222");
                break;
                case 3:
                System.out.println("3333333");
                break;
                default:
                System.out.println(".........defult........");
                
        }
    }
}
