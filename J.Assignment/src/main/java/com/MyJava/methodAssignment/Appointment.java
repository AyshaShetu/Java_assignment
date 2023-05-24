package com.MyJava.methodAssignment;
//A class representing an appointment with properties like date, time, and location.
// Declare the Class Name: Appointment
// Declare Class properties/variable
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties

import java.util.Date;

public class Appointment {
    private  String date;
    private Date time;
    private String location;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date getTime(){
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location= location;
    }

            public static void main(String[] args) {
        Appointment appointment = new Appointment();
        appointment.setDate("5th may, 2023");
        appointment.setLocation("Irving,Tx");

        Date date1 = new Date();               // <--------
        appointment.setTime(new Date());                                              // <---------


        System.out.println(
                "Hello from Appointment class!" +
                "\nDate : " + appointment.getDate() + ", Time: " + appointment.getTime() + ", Location : " + appointment.getLocation()
        );

    }
}