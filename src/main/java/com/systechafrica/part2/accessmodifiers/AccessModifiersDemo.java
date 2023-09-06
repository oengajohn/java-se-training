package com.systechafrica.part2.accessmodifiers;

import java.util.logging.Logger;

import com.systechafrica.part2.accessmodifiers.lms.Book;



public class AccessModifiersDemo {
    // private static final Logger LOGGER = Logger.getLogger(AccessModifiersDemo.class.getName());

    public static void main(String[] args) {
        Person person2 = new Person("John","john@example.com");
        Person person = new Person();
        // person.name = "John";
        person.setName("John 34");
        // person.email = "john@example.com";
        person.setEmail("john@example.com");
        person.printPersonalDetails();
        // person.getPersonalDetails();
        person.getName();

        
    }
    
    public void accessDefault(){
        Book book =  new Book();
        //book.isbn = "46563258995445"; //does nto compile beacuse the properties and methods are using 
        // default access modifiers inside lms
        //book.title = "Java programming";
        //book.printBookDetails();
    }

    
}
