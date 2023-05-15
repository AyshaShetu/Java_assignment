package com.MyJava.If_else_assignment;

public class BankAccount {
    public static void main(String[] args) {
        int accountNumber = 234;
        double balance = 51876.66;
        String owner = "Aysheen";

        System.out.println(
                "Account number : " + accountNumber +
                        "\nBalance : " + balance +
                        "\nOwner's name : " + owner
        );

        if (accountNumber == 234){
            System.out.println("Account is active");
        }
    }
}
