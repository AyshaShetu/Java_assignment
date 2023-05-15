package com.MyJava.If_else_assignment;

public class LibraryBook {
    public static void main(String[] args) {
        String title="Harry Potter";
        String author="J. K. Rowling";
        String ISBN="12345";
        boolean isOverdue=false;

        System.out.println("info for LibraryBook Class!\n" +
                "title: Harry Potter!\n" +
                "author: J. K. Rowling\n" +
                "ISBN: 864567");

        if(isOverdue==false) {
            System.out.println("it's overdue");
        }
        else{
            System.out.println("not overdue");
        }
    }
}
