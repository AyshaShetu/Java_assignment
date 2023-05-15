package com.MyJava.If_else_assignment;

public class Book {
    public static void main(String[] args) {
        String title = "laptop";
        String AuthorName = "Cedrick";
        int IsBN = 987567;

        System.out.println(
                "Book name :  " + title +
                        "\nAuthor name :  " + AuthorName +
                        "\nISBN number :  " + IsBN
        );

        if (title == "laptop") {
            System.out.println("Yes, this is about laptop");
        }
    }
}
