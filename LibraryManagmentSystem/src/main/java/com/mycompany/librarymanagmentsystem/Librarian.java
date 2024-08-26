
package com.mycompany.librarymanagmentsystem;


public class Librarian extends Person{
    String staffID;
    String signedDuties;

    public Librarian(String staffID, String signedDuties, String name, int id) {
        super(name, id);
        this.staffID = staffID;
        this.signedDuties = signedDuties;
    }

    public void addBook(Book[]books, Book newBook, int index){
        if(index<books.length){
            books[index]=newBook;
            System.out.println(newBook.title+" has been added to the library.");
        }else{
            System.out.println(" No space available to add the book.");
        }}
        
    public void registerMember(Member[] members,Member newMember, int index){
        if(index<members.length){
            members[index]=newMember;
            System.out.println(newMember.name+" has been registered as a member.");
        }else{
            System.out.println("No space Available to Register the Member.");
        }
    
    }
    
}

