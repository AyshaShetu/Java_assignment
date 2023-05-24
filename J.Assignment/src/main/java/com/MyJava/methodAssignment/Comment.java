package com.MyJava.methodAssignment;

import java.util.Date;

public class Comment {
    private String author;
    private String content;
    private Date date;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Rosalin");
        comment.setContent("Today's weather forecast");

        Date date1 = new Date();
        comment.setDate(new Date());

        System.out.println("Author : " + comment.getAuthor() +
                "\nContent : " + comment.getContent() +
                "\nDate : " + comment.getDate() );
    }
}
// Comment - A class representing a comment with properties like author, content, and date.
// Declare the Class Name: Comment
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties