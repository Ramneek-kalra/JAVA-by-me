/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance; 

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int x[]={3,4,7,8,9};
        checkPrime(x);
    }
    
  
    static void checkPrime(int numbe[] ){
        for (int num:numbe){
            if(BigInteger.valueOf(num).isProbablePrime(1)){
                System.out.println(num+" ");
            }
        }
    }       
}
