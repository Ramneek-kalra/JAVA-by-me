/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ObjectBySet {
   int id;
   String name;
   
   public ObjectBySet(){
       
   }
    public static void main(String[] args) {
        ObjectBySet student=new ObjectBySet();
        student.setId(10);
        student.setName("wadud");
        System.out.println(student);
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectBySet{" + "id=" + id + ", name=" + name + '}';
    }
    
}
