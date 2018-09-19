/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DogSetGet {

    String name;
    String color;
    String race;
    int age;

    public static void main(String[] args) {
        DogSetGet dog=new DogSetGet();
        dog.setName("Roki");
                dog.setColor("White");
                dog.setRace("Italian");
                dog.setAge(2);
                System.out.println("Name: "+dog.getName());
                System.out.println("Color: "+dog.getColor());
                System.out.println("Race: "+dog.getRace());
                System.out.println("Age: "+dog.getAge());
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    
}
