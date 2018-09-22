/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class String8ulderAppend {

    public static void main(String[] args) {
        StringBuilder er = new StringBuilder();
        er.append("Welcome");
        er.append(' ');
        er.append("to");
        er.append(' ');
        er.append("Java");
        System.out.println("er: " + er);

        er.delete(8, 11);
        System.out.println("er: " + er);

        er.deleteCharAt(8);
        System.out.println("er: " + er);

        er.reverse();
        System.out.println("er: " + er);

        er.replace(11, 15, "AZAD");
        System.out.println("er: " + er);

        er.setCharAt(0, 'w');
        System.out.println("er: " + er);
    }

}
/*
Result are
er: Welcome to Java
er: Welcome Java
er: Welcome ava
er: ava emocleW
er: ava emocleWAZAD
er: wva emocleWAZAD
*/
