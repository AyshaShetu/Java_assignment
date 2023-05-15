package com.MyJava.If_else_assignment;

public class NewsSource {
    public static void main(String[] args) {
        String name = "BBC";

        System.out.println("info of NewsSource Class!\n" +
                "name: BBC\n" +
                "url: https://www.bbc.com\n" +
                "description: is BBC is a great source of news?");

        if (name =="BBC"){
            System.out.println("Useless");
        }
        else {
            System.out.println("Cannot say much");
        }
    }
}
