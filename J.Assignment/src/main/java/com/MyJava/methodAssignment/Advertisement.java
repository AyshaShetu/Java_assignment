package com.MyJava.methodAssignment;

public class Advertisement {
    private String title;
    private String description;
    private String targetAudience;

         public String getTitle() {
         return title;
  }
         public void setTitle(String title){
          this.title = title;
         }

         public String getDescription() {
        return description;
    }
         public void setDescription(String description){
        this.description = description;
    }

    public String getTargetAudience() {
        return targetAudience;
    }
    public void setTargetAudience(String targetAudience){
        this.targetAudience = targetAudience;
    }

    public static void main(String[] args) {
        Advertisement details = new Advertisement();
        details.setTitle("Nike");
        details.setDescription("Makes good quality Shoes");
        details.setTargetAudience("All age");

        System.out.println("hello from advertisement class!" +
                "\nTitle : " + details.getTitle() + ", Description: " + details.getDescription() + ", Target audience: " + details.getTargetAudience());

    }
}

//A class representing an advertisement with properties like title, description, and target audience.
// Declare the Class Name: Advertisement
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties