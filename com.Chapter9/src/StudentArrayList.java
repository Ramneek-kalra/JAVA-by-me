/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public final class StudentArrayList {
    private final int id;
    private final String name;

    public StudentArrayList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentArrayList{" + "id=" + id + ", name=" + name + '}';
    }
    
}
