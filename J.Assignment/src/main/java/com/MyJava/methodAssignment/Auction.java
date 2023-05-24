package com.MyJava.methodAssignment;
// Auction - A class representing an auction with properties like item, start, and end times.
//import java.util.Date;
// Declare the Class Name: Auction
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties

import java.util.Date;

public class Auction {
  private String item;
  private Date start;
  private Date end;
  private  String date;

  public String getItem(){
      return item;
  }
  public void setItem(String item){
      this.item = item;
  }

    public Date getStart(){
        return start;
    }
    public void setStart(Date start){
        this.start = start;
    }

    public Date getEnd(){
        return end;
    }
    public void setEnd(Date end){
        this.end = end;
    }

    public  String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public static void main(String[] args) {
        Auction obj = new Auction();
            obj.setItem("Car");
            obj.setDate("21st may");
        Date date1 = new Date();                // <------
            obj.setStart(new Date());            // <------
            obj.setEnd(new Date());

        System.out.println(
                "Hello from Auction class!" +
                "\nItem : " + obj.getItem() + ", Start time : " + obj.getStart() + ", End Time : " + obj.getEnd() + ", Date : " + obj.getDate());
    }
}
