package com.MyJava.ObjectCreation;

import java.util.Date;

public class Auction {
    String item, startTime, endTime;
    Date date1;
    public static void main(String[] args) {
    Auction obj = new Auction();    //object instance
        obj.date1 = new Date();
        obj.item = "car";
        obj.startTime = "9:00 am";
        obj.endTime = "12: pm";
        obj.date1 = new Date();
        System.out.println("Item : " + obj.item +
                            "\nStating time : " + obj.startTime +
                            "\nEnding time :  " + obj.endTime +
                             "\nDate : " + obj.date1);
    }
}
