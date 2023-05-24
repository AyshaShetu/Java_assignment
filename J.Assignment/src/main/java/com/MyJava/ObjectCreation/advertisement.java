package com.MyJava.ObjectCreation;

public class advertisement {
    private  String title;
    private String description;
    private String targetAudience;

    public void info(){
        System.out.println("title :  " +  title);
        System.out.println("description :  "  +  description);
        System.out.println("targetAudience : "  +  targetAudience);

    }

    public static void main(String[] args) {
        advertisement details = new advertisement();
        details.title = "Nike";
        details.description = "Shoe company ";
        details.targetAudience = "everyone";
        details.info();

    }
}
