/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayAssendingDesinding {
    public static void main(String[] args) {
        int[] arr={1,4,3,9,5};
        for(int i:arr){
            System.out.print(i+" ");   
        }
        System.out.println();
        
        System.out.println("Array Assending");
        int[] a={1,4,3,9,5};
        Arrays.sort(a);
        for (int j:a){
            System.out.print(j+" ");
        }
        
         System.out.println();
        
        System.out.println("Array Assending");
        Scanner sc=new Scanner(System.in);
        int[] c={1,4,3,9,5};
        Arrays.sort(c);
        
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]+" ");
        }
        
        
    }
}
