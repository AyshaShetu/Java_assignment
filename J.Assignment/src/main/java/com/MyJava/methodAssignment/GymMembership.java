package com.MyJava.methodAssignment;

import java.util.Date;

public class GymMembership {
    private String Name;
    private  String type;
    private Date startDate;
    private Date date;

    public String getName(){
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public static void main(String[] args) {
        GymMembership obj = new GymMembership();
        obj.setName("Ruzaina");
        obj.setType("VIP");
        obj.setStartDate(new Date());
        obj.setDate(new Date());
        System.out.println(
                "Member name: " +obj.getName() +
                "\nNumber : " + obj.getType() +
                        "\nExpiration Date: " + obj.getStartDate() +
                "\nExpiration Date: " + obj.getDate()
        );
    }
}
// GymMembership - A class representing a gym membership with properties like member, type, and start date,end date.
// Declare the Class Name: GymMembership
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties