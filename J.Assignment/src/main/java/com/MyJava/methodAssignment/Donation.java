package com.MyJava.methodAssignment;

import java.util.Date;

public class Donation {
  private String donorName;
  private  double amount;
  private Date donationDate;

public void setDonorName(String name){
    this.donorName = name;
}
public String getDonorName(){
    return donorName;
}
public void setAmount(double amount){
    this.amount = amount;
}
public double getAmount() {
     return amount;
    }
public void setDonationDate(Date donationDate){
    this.donationDate = donationDate;
}
public Date getDonationDate() {
    return donationDate;
    }


    public static void main(String[] args) {
    Donation donation = new Donation();
    donation.setDonorName("Naira");
    donation.setAmount(500.00);
    donation.setDonationDate(new Date());

    System.out.println(
        "Donor name : " + donation.getDonorName() +
        "\nAmount : " + donation.getAmount() +
        "\nDonation Date : " + donation.donationDate
        );
    }
}
// Donation - A class representing a donation with properties like donor, amount, and donation date.
// Declare the Class Name: Donation
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties