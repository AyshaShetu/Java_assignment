package com.MyJava.ObjectCreation;

public class BankAccount {
    String owner;
    int accountNumber;
    double balance;

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.owner = "Sam";
        obj.accountNumber = 56789;
        obj.balance = 550.50;

        System.out.println("Bank account details : " + " " +
                           "\nOwner : " + obj.owner +
                            "\nAccount Number : "  +  obj.accountNumber +
                            "\nBalance : " + obj.balance);

    }
}
