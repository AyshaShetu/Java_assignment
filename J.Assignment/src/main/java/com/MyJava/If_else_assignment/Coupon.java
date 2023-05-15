package com.MyJava.If_else_assignment;

import java.util.Date;

public class Coupon {
    public static void main(String[] args) {
        int code = 899;
        double discountAmount = 56.89;
        Date expirationDate = new Date();

        System.out.println(
                "Coupon code : " + code +
                "\nDiscount Amount :  " + discountAmount +
                "\nExpiration Date :  " + expirationDate
        );

        if (code == 899) {
            System.out.println("This code is working");

        }
    }
}
