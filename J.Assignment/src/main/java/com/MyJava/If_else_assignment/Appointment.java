package com.MyJava.If_else_assignment;

public class Appointment {
    public static void main(String[] args) {
        String DoctorName = "John";
        String date = "5/8/2023";
        String time = "06:00 pm";
        String location = "Doctor Office";

        System.out.println(
                        "Doctor's Name : " + DoctorName +
                        "\nDate : " + date +
                        "\nTime : " + time +
                        "\nLocation : " + location
        );

        if (DoctorName == "John"){
            System.out.println("My doctor's name is John");
        }
    }
}
