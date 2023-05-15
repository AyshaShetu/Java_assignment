package com.MyJava.If_else_assignment;

public class InVoice {
    public static void main(String[] args) {
        int items = 5;

        System.out.println("info of Invoice Class!\n" +
                "invoice number: 454358\n" +
                "customer: 5\n" +
                "items: 75");

        if (items < 5)
        {
            System.out.println("you are right");
        }
        else
        {
        System.out.println("enter correct amount : " + items);
    }
    }
}