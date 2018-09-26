/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OtherPractices;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities= {" Savannah"," Boston"," Atlanta"," Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city+"");
        System.out.println();
        
        BigInteger[] hugeNumbers={new BigInteger("4555555555566666666666888"),
            new BigInteger("666555599444244"),
            new BigInteger("8886666646")};
                java.util.Arrays.sort(hugeNumbers);
                for(BigInteger number: hugeNumbers)
                    System.out.print(number+" ");

    }
}
