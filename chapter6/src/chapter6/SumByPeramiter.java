/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author User
 */
public class SumByPeramiter {

    public static void main(String[] args) {
        SumByPeramiter m = new SumByPeramiter();
        int re = m.makeSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("re: " + re);
    }

    public int makeSum(int num1, int num2, int num3, int num4, int num5,
            int num6, int num7, int num8, int num9, int num10) {
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9+ num10;
        return sum;
    }

}
