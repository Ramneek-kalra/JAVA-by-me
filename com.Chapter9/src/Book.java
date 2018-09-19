/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {
    String name;
    String writer;
   int publishedYear;
   
    public Book(){
    }

    public Book(String name, String writer, int publishedYear) {
        this.name = name;
        this.writer = writer;
        this.publishedYear = publishedYear;
    }
    public static void main(String[] args) {
        Book newbook=new Book("The Gurdian of BD","Wadud Azad",2018);
        System.out.println("Book Name: "+newbook.getName());
         System.out.println("Writer Name: "+newbook.getWriter());
          System.out.println("Year of Published: "+newbook.getPublishedYear());
    }
    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
    
}
