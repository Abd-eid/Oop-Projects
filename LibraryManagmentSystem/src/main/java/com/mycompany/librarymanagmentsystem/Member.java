
package com.mycompany.librarymanagmentsystem;


public class Member extends Person {

    int borrowedBookId;

    // اضافة كتاب جديد
    // في اي كلاس لازم اكون موجود 

    public Member(int borrowedBookId, String name, int id) {
        super(name, id);
        this.borrowedBookId = borrowedBookId;
    }
    
    
    public void borrowBook(Book book){
        if(borrowedBookId==-1 && !book.isBorrowed){
            System.out.println(name+" has borrowed "+book.title+" .");
            book.isBorrowed=true;
        }else{
            System.out.println(book.title+" is already borrwed.");
        }
    }
    }
