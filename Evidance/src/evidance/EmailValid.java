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
public class EmailValid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Entern a valid email address; ");
        String email=s.nextLine();
        int atThe=email.indexOf("@");
        int dot=email.indexOf(".");
        if(atThe > 0 && dot <email.length() -1 && atThe < dot -1){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is invlaid");
        }
    }
}
