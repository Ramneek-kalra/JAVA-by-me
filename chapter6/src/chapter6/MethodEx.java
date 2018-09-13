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
public class MethodEx {

    String abc;
    String msg="Hello Programmers";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hi i'm void method");
        MethodEx m=new MethodEx();
        
        int rs=m.display2();
        System.out.println(""+rs);
        
        String re=m.display3();
        System.out.println(""+re);
        
        String rr=m.display4();
        System.out.println(""+rr);
        
        String rt=m.display5();
        System.out.println(""+rt);
        
        String ry=m.display6();
        System.out.println(""+ry);
    }
    
    
    //access modifier like public/protected/private\/default
    //If empety, then it is default
    //data type like primitive(bye, short, int, float, long, double) or classs type(String or any class name)or void 
   // If type is void
    
   public void display1(){
       System.out.println("Hi i'm 2nd void method");
         
     } 
    
   public int display2(){
       int x=10;
       return x;
      
   } 
   
   public String display3(){
     String str="Hello World";
             return str;
   }
   
   
   public String display4(){
       return "Hello World";
   }
   
  public String display5(){
      abc="Display5";
      return abc;
  }
   
  public String display6(){
     
      return msg;
      
  }
  
  
}
