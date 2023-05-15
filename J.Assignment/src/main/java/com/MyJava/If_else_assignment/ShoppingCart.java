package com.MyJava.If_else_assignment;

public class ShoppingCart {
    public static void main(String[] args) {
        int quantity = 70;
        System.out.println(" info of ShoppingCart class!\n" +
                "# items : \n" +
                "1. Jewelry\n" +
                "# quantity :" +
                "5 each\n" +
                "# total price : 250.00");

        if (quantity > 50){
            System.out.println("you are shopaholic");
        }

        else {
            System.out.println("Boring");
        }
    }
}
