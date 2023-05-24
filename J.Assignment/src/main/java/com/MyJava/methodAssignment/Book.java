package com.MyJava.methodAssignment;

public class Book {
    private  String title;
    private  String author;
    private  int ISBN;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        Book obj = new Book();
        obj.setAuthor("J. k. Rowling");
        obj.setTitle("Harry Potter");
        obj.setISBN(567890);

        System.out.println("Title : " + obj.getTitle() +
                "\nAuthor : " + obj.getAuthor() +
        "\nISBN : " + obj.ISBN);
    }
}
// Book - A class representing a book with properties like title, author, and ISBN.
// Declare the Class Name: Book
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties