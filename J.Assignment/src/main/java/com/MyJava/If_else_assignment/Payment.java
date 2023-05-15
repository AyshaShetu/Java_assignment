package com.MyJava.If_else_assignment;

public class Payment {
    public static void main(String[] args) {
        String paymentMethod = "card";

        System.out.println("Hello From Payment Class!\n" +
                "payment method : cash\n" +
                "amout ; 100\n" +
                "date : 09/09");

        if (paymentMethod == "card") {
            System.out.println("Enter card number");
        }
        else {
            System.out.println("Pay in cash");
        }
    }
}
