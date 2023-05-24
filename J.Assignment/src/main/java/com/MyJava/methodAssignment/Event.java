package com.MyJava.methodAssignment;

import java.util.Date;

public class Event {
    private String name;
    private Date date;
    private String location;

public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setDate(Date date){
    this.date = date;
}
public Date getDate(){
    return date;
}
public void setLocation(String location) {
     this.location = location;
}

public String getLocation() {
    return location;
    }

    public static void main(String[] args) {
        Event event = new Event();
        event.setName("Transition Ceremony");
        event.setLocation("Clifton ECI");
        event.setDate(new Date());

    System.out.println(
            "Event : " + event.getName() +
            "\nLocation : " + event.getLocation() +
            "\nDate : " + event.getDate()
                      );
    }
}

// Event - A class representing an event with properties like name, date, and location.
// Declare the Class Name: Event
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties