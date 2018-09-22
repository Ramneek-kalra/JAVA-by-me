/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestMatchesReplaceSplit {
    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("ABC"));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;","#"));
        System.out.println("A,B;C".replaceAll("[,;]","#"));
        String[] tokens="A,B;C".split("[,;]");
        for(int i=0;i<tokens.length;i++)
            System.out.print(tokens[i]+" ");
        
        String s="Hi,Good Morning";
        System.out.println(m(s));   ///will show how many Upper Case in 's'
    }
    public static int m(String s){
       int count=0;
       for (int i=0;i<s.length();i++)
           if(Character.isUpperCase(s.charAt(i)))
               count++;
       return count;
    };
}
