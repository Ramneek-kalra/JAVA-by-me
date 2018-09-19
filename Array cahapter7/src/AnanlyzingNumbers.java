
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AnanlyzingNumbers {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = x.nextInt();
        double [] numbers=new double[n];
        double sum = 0;
        
        System.out.println("Enter the numbers: ");
        for (int i=0; i<n; i++){
         numbers[i]=x.nextDouble();
         sum+=numbers[i];
        }
        
        double average=sum / n;
        
        int count=0;
        for (int i=0; i<n; i++)
            if(numbers[i]>average)
                count++;
        
        System.out.println("Average is: "+average);
        System.out.println("Number of elements above the average is " + count);
                        
                        
        
        
        
        
        
        
        
    }
}
