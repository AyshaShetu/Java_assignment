package com.MyJava.If_else_assignment;

public class Recipe {
    public static void main(String[] args) {
        String ingredients = "meat";

        System.out.println("Name: french fry");
        System.out.println("Ingredients: potato, oil, seasoning");
        System.out.println("instructions: cut potato, deep fry and sprinkle seasoning.");

        if (ingredients == "meat") {
            System.out.println("Lets cook");
        }
        else {
            System.out.println("I do not like vegetables much");
        }
    }
}
