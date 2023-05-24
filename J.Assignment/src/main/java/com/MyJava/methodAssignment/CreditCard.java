package com.MyJava.methodAssignment;

import java.util.Date;

public class CreditCard {
    private int number;
    private Date expDate;
    private String cardHolderName;


public String getCardHolderName(){
    return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
}

public int getNumber() {
    return number;
}
public void setNumber(int number) {
    this.number = number;
    }

public Date getExpDate() {
    return expDate;
    }
public void setExpDate(Date expDate) {
    this.expDate = expDate;
    }


    public static void main(String[] args) {
        CreditCard obj = new CreditCard();
        obj.setCardHolderName("Anaiza");
        obj.setNumber(1234567890);
        obj.setExpDate(new Date());

    System.out.println(
                "Cardholder name: " +obj.getCardHolderName() +
                "\nNumber : " + obj.getNumber() +
                "\nExpiration Date: " + obj.getExpDate()
                       );
    }
}


// CreditCard - A class representing a credit card with properties like number, expiration date, and cardholder name.
// Declare the Class Name: CreditCard
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties