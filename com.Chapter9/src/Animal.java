/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Animal {

    String name;
    String color;
    String race;
    double age;

    public Animal() {
    }

    public Animal(String name, String color, String race, double age) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.age = age;
    }
void bite(){}

   
    public static void main(String[] args) {
        // TODO code application logic here
        Animal nova = new Animal();
        Animal animal1500 = new Animal("Mr Nova", "gray",  "Kazi",20.5);
        System.out.println(animal1500);
        
    }
   
           public String toString(){
               return"Animal {"+"name= "+name+", color= "+color+", age= "+age+", race= "+race+"}";
           }
    
    
}
