package com.MyJava.If_else_assignment;

public class Product {
    public static void main(String[] args) {
        String name = "laptop";

        System.out.println("info of Product Class!\n" +
                "name : laptop\n" +
                "price : 10.00\n" +
                "description : latest technology");

        if (name == "laptop") {
            System.out.println("Lets buy");
        }
        else {
            System.out.println("I cannot shop");
        }
    }
}
