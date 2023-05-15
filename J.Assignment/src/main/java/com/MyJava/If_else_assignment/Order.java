package com.MyJava.If_else_assignment;

public class Order {
    public static void main(String[] args) {
        String customerType = "member";

        System.out.println("info of Order Class!\n" +
                "order number: 11\n" +
                "customer type : member\n" +
                "amount : 30.30");

        if (customerType == "member") {
            System.out.println("give extra discount");
        }
           else{
                System.out.println("no discount");
            }
        }
    }
