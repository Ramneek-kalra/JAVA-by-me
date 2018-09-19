/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ArrayMethodArgument {
    public static void main(String[] args) {
        int x[] ={8,9,5,4};
        dispalyarray(x);
    }
    public static void dispalyarray(int[] arr) {
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
        public static int[] transferArray(int[] sourceArray) {
         int[] targetArray = new int[sourceArray.length]   ;
            System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        return targetArray;
    }
    }
