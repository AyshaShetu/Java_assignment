package com.MyJava.methodAssignment;
// auction 2nd way
import java.util.Date;
public class Auction2 {
    public static class Auction {
        private String item;
        private Date startTime;
        private Date endTime;

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public static void main(String[] args) {
            Auction auction = new Auction();
            auction.setItem("car");
            auction.setStartTime(new Date());
            auction.setEndTime(new Date());

            System.out.println("Item: " + auction.getItem());
            System.out.println("Start Time: " + auction.getStartTime());
            System.out.println("End Time: " + auction.getEndTime());
        }
    }
}
// Auction - A class representing an auction with properties like item, start, and end times.
//import java.util.Date;
// Declare the Class Name: Auction
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties