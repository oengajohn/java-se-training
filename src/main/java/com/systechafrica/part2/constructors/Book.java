package com.systechafrica.part2.constructors;

public class Book {
    private int isbn;
    private String title;
    private boolean available;

    public Book(int isbn, String title, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.available = available;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object obj) {
        // non-null check
        if(obj==null){
            return false;
        }
        //convert the obj to the book instance
        Book book = (Book) obj;

        if(this.isbn==book.getIsbn()){
            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return isbn;
    }

    //Alt+Enter



    


}
