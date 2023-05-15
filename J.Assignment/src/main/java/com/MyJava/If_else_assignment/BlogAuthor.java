package com.MyJava.If_else_assignment;

public class BlogAuthor {
    public static void main(String[] args) {
        String name = "Jahidul";
        String bio = "Sky is limit";
        String article = "QAEE";

        System.out.println(
                "Name :  " + name +
                        "\nBio :  " + bio +
                        "\nArticle name :  " + article);

        if (name == "Jahidul") {
            System.out.println("Jahidul is author");
        }
    }
}