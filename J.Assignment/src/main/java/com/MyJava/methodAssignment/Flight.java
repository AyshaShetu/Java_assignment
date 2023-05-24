package com.MyJava.methodAssignment;

import java.util.Date;

public class Flight {
    private  int  flightNumber;
    private Date departureTime, arrivalTime;

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public static void main(String[] args) {
        Flight obj = new Flight();
        obj.setFlightNumber(567);
        obj.setDepartureTime(new Date());
        obj.setArrivalTime(new Date());

    System.out.println(
        "Flight number : " + obj.getFlightNumber() +
        "\nDeparture time : " + obj.getDepartureTime() +
         "\nArrival time : " + obj.getArrivalTime()
                      );
    }
}
// Flight - A class representing a flight with properties like flight number, departure time, and arrival time.
// Declare the Class Name: Flight
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties