package com.MyJava.methodAssignment;


public class BankAccount {
  private  String owner;
  private int accountNumber;
  private double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return  balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setOwner("Aysheen");
        bankAccount.setAccountNumber(3456789);
        bankAccount.setBalance(50000.00);

        System.out.println(
                "Hello from bank account class" +
                        "\nOwner : " + bankAccount.getOwner() +
                        ", Account number : " + bankAccount.getAccountNumber() +
                        ", Balance : " + bankAccount.getBalance() );
    }
}


// BankAccount - A class representing a bank account with properties like account number, balance, and owner.
// Declare the Class Name: BankAccount
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties