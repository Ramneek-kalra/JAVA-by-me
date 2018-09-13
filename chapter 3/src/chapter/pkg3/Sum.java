/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg3;

/**
 *
 * @author User
 */
public class Sum {
    public static void main(String[] args) {
        int num=0;
        int num1=1;
        int num2=10;
        while (num1<=num2){
        num += num1;
        num1++;
    }
        System.out.println("num: "+num);
    }
}
