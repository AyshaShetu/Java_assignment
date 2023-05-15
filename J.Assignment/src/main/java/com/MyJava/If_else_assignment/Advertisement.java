package com.MyJava.If_else_assignment;

public class Advertisement {
    public static void main(String[] args) {

        String title = "IzaanSchool";
        String Description = "Java class";
        String targetAudience = "Students";

        System.out.println("title :" + title);
        System.out.println("Description :" + Description);
        System.out.println("target Audience :" + targetAudience);

        if (targetAudience == "Students")
        {
            System.out.println("Students are the  targeted audience for this Advertisement");
        }
    }
}
