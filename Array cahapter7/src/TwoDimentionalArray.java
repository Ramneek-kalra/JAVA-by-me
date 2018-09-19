/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TwoDimentionalArray {
    public static void main(String[] args) {
        int twoDi[][]={     //// Two Dimentoomnal Array
        {2,3,5,6},
         {7,8,9},
         {1,4,7,9}  
    };
        System.out.println("twoDi: "+twoDi[1][1]);
        System.out.println("twoDi: "+twoDi[2][0]);
        
          for (int one[]:twoDi){
              for (int i : one){
                  System.out.println(i+" ");
              }
          };
        ////Another Two Dimentoomnal Array
        String twoD[][]={
            {"A","C"},
            {"B","D"}
        };
        System.out.println("twoDi: "+twoD[1][0]);
        System.out.println("twoDi: "+twoD[0][0]);
        
      
    }
}
