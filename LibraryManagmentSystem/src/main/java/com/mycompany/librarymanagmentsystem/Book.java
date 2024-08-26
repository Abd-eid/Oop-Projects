
package com.mycompany.librarymanagmentsystem;


public class Book {
   
    //attr
    String title;
    String ID;
    String author;
    boolean isBorrowed;
    
    //constructer 

    public Book(String title, String ID, String author) {
        this.title = title;
        this.ID = ID;
        this.author = author;
        this.isBorrowed=false;
    }
    
    
}