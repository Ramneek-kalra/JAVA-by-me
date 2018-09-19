/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {
    String name;
    String subject;
    String year;
    double age;
    
    public Student(){
        
    }

    public Student(String name, String subject, String year, double age) {
        this.name = name;
        this.subject = subject;
        this.year = year;
        this.age = age;
    }
    
void bite(){ 
}
    public static void main(String[] args) {
        Student s1=new Student("Abdul","BBA","2017",24);
        System.out.println(s1);
        
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", subject=" + subject + ", year=" + year + ", age=" + age + '}';
    }
     
}
