/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TheeDimention {

    public static void main(String[] args) {
        String threeD[][][] = { //Here one Three Dimention, three Two Dimention and six One dimention
            {
                {"A", "B"},
                {"C", "D"}
            }, {
                {"E", "F"},
                {"G", "H"}
            }, {
                {"I", "J"},
                {"K", "L"}
            }
                
        };
        System.out.println("threeD[][][]: "+threeD[1][1][0]);
    }
}
