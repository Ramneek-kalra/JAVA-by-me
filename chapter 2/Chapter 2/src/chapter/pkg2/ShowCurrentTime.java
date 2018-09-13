/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
        long totalMilisecond = System.currentTimeMillis();
        long totalSecond = totalMilisecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long timeofBd = currentHours + 6;
        System.out.println("Current time is " + timeofBd + ":" + currentMinutes + ":" + currentSecond);

        //double range= Math,pow((2,31)-1);
        
        int x = 10;
        long y = x;
        System.out.println(x);
        
        long w = 10;
        int z = (int) w;
        System.out.println(z);

       double a = 9;
       a += a+2;
       System.out.println(a);
       
     
    int r = 2;
        System.out.println(r);
       
        
     
    }

}
