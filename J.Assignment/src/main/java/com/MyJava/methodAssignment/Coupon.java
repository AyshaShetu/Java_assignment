package com.MyJava.methodAssignment;

import java.util.Date;
import java.util.concurrent.Callable;

public class Coupon {
    private int code;
    private  double discountAmount;
    private Date expDate;


public int getCode(){
    return  code;
}
public void setCode(int code){
    this.code = code;
}

public double getDiscountAmount() {
    return discountAmount;
    }
public void setDiscountAmount(double discountAmount) {
     this.discountAmount = discountAmount;
    }

public Date getExpDate() {
        return expDate;
    }
public void setExpDate(Date expDate) {
    this.expDate = expDate;
    }


    public static void main(String[] args) {
        Coupon coupon = new Coupon();
        coupon.setCode(1234567890);
        coupon.setDiscountAmount(50.00);
        coupon.setExpDate(new Date());

        System.out.println(
               "Coupon code : " + coupon.getCode() +
               "\nDiscount amount : " + coupon.getDiscountAmount() +
               "\nExp date : " + coupon.getExpDate()
                           );
    }
}
// Coupon - A class representing a coupon with properties like code, discount amount, and expiration date.
// Declare the Class Name: Coupon
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties