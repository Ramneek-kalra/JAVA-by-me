
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DescendingArray {
    public static void main(String[] args) {
        int[] x={5,3,12,34,75};
        Arrays.sort(x);
        int newArray[] = new int[x.length];
        int j=0;
        for(int i=x.length-1;i>=0;i--){
            newArray[j]=x[i];
            j++;
            }
        for (int k: newArray){
            System.out.print(k+" ");
        }
     }
}
