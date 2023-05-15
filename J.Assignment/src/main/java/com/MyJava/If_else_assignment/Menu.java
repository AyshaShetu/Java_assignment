package com.MyJava.If_else_assignment;

public class Menu {
    public static void main(String[] args) {
        String item = "Chinese Vegetable";
        String description = "various vegetable made with chicken";
        double price = 30.50;
        boolean isVegetarian = true;

        System.out.println(
                "item: Chinese Vegetable\n" +
                        "description: various vegetable made with chicken\n" +
                        "price: 30.50");

        if (isVegetarian == false) {
            System.out.println("All Menu foods are for Vegetarians!");
        }
        else {
            System.out.println("bring some meat too");
        }
    }
}