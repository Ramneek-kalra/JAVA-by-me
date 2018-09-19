/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConstructorBaseObject {
    int id;
    String name;
    
    public ConstructorBaseObject(){
    }

    public ConstructorBaseObject(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        ConstructorBaseObject classroom =new ConstructorBaseObject(301,"Java Room");
        System.out.println("ID: "+classroom.getId());
         System.out.println("Room Name: "+classroom.getName());
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
