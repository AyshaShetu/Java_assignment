package com.MyJava.ObjectCreation;
    import java.util.Date;

public class BlogPost {
    String title;
    String author;
    String content;
    Date date;

    public static void main(String[] args) {
        BlogPost obj = new BlogPost();
        obj.title = "Environment";
        obj.author = "Aurora";
        obj.content = "Environment pollution";

        System.out.println("Title : " + obj.title +
                 "\nAuthor: " + obj.author +
                 "\nContent: "  + obj.content +
                 "\nDate : " + obj.date);
    }
}

