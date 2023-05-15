package com.MyJava.If_else_assignment;

public class Auction {
    public static void main(String[] args) {
        String Item = "Laptop";
        String start = "7:00 a.m";
        String end_time = "9:00 a.m";

        System.out.println(
                "Item name = " + Item +
                        "\nStarting time = " + start +
                        "\nEnding time = " + end_time
        );

        if (Item == "Laptop") {
            System.out.println("Yes, this is laptop");
        }

    }
}
