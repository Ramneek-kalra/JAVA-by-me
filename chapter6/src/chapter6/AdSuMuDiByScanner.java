/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AdSuMuDiByScanner {
      public static void main(String[] args) {
          
          AdSuMuDiByScanner m=new AdSuMuDiByScanner();
          int mm=m.Addition(6, 3, "/");
          System.out.println("Reasult: "+mm);
    //    AdSuMuDi m= new AdSuMuDi();
       //  Scanner sc= new Scanner(System.in);
      ///  System.out.println("Enter 1st number: ");
      // int first=sc.nextInt();
      //  System.out.println("Enter simble of wht u want to do: ");
       // String sym=sc.nextLine();
       // System.out.println("Enter 2st number: ");
       //     int second=sc.nextInt();
     
    }
  public int Addition(int num1, int num2,String str){
    
      int rt=0;
      if (str=="+"){
          rt=num1+num2;
      }else if(str=="-"){
           rt=num1-num2;
      }else if(str=="/"){
           rt=num1/num2;
      }else if(str=="*"){
           rt=num1*num2;
      }else if(str=="%"){
           rt=num1%num2;
  }
    return rt;  
  }
}
