package com.MyJava.methodAssignment;

public class Contact {
    private  String name;
    private  String email;
    private int phoneNumber;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

   public String getEmail(){
        return email;
   }
   public  void setEmail(String email){
        this.email = email;
   }

   public int getPhoneNumber(){
       return phoneNumber;
   }
   public void setPhoneNumber(int phoneNumber){
       this.phoneNumber = phoneNumber;
   }


    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setName("Stacy");
        contact.setEmail("stacy@gmail.com");
        contact.setPhoneNumber(2145678990);

        System.out.println("Name : " + contact.getName() +
                           ", Email : " + contact.getEmail() +
                           ", Phone number : " + contact.getPhoneNumber());
    }



}
// Contact - A class representing contact with properties like name, email, and phone number.
// Declare the Class Name: Contact
// Declare Class properties/variables
// Getters and setters methods for the properties
// Declare Main Method
// Create an object instance of the class
// Access the object's properties