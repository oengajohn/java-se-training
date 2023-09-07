package com.systechafrica.part2.accessmodifiers.lms;

import org.junit.jupiter.api.Test;


public class LMSTest {

    @Test
    void books() {
        Book book =  new Book();
        book.isbn = "46563258995445"; 
        book.title = "Java programming";
        book.printBookDetails();

    }

}
