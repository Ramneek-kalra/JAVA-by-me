/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentEmutable {
    private final int id;          // when final taken then it converted to immutable object
    private final String name; //when we take constructor then error will be remove

    public StudentEmutable(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        
    }
    @Override
    public String toString() {
        return "StudentEmutable{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
