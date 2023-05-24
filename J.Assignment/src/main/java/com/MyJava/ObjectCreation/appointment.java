package com.MyJava.ObjectCreation;
// Appointment - A class representing an appointment with properties like date, time, and location.
// Declare the Class Name: Appointment
// Declare Class properties:
// Declare Main Method
// Print
// Create an object instance of the class
// Access the object's properties

public class appointment {
     String date, time, location;

     public static void main(String[] args) {
          appointment details = new appointment();
          details.date = "5/5/25";
          details.time = "6:00 pm";
          details.location = "Plano,Tx";

          System.out.println("Date : " + details.date+
                             "\nTime : "  + details.time +
                              "\nlocation : "  + details.location);
     }
}
