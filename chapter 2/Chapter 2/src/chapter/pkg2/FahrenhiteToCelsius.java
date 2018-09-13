/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg2;

import java.util.Scanner;

public class FahrenhiteToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Faraenhite: ");
        double faraenhite = input.nextDouble();

        double celsius = (5.0 / 9) * (faraenhite - 32);
        System.out.println("faraenhite" + faraenhite + " is " + celsius + " in celsius");
int x =10;
long y =x;
System.out.println("x "+x+" y: "+y);

long w=500;
int v=  (int) w;
System.out.println("w: "+w+"v: "+v);
    }
}
   