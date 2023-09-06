package com.systechafrica.part2.accessmodifiers.lms;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book =  new Book();
        book.isbn = "46563258995445"; 
        book.title = "Java programming";
        book.printBookDetails();
    }
    
}
