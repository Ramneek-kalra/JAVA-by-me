/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author User
 */
public class EqualCompare {
    public static void main(String[] args) {
        String str1="Bangladesh";
        String str2="Bangladesh";
        if (str1==str2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
         
        //use equals() method
        //equals() is case sensative
        if (str1.equals(str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
      
        
//equalsIgnoreCaseuse
      
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        
    }
    
    
    
}
