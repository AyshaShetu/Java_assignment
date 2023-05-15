package com.MyJava.If_else_assignment;

public class address {
    public static void main(String[] args) {
        String street = "street: 3942 boise ct";
        String city = "NY";
        String city2 = "CA";
        String zipcode = "75069";
        boolean hasStreetName = true;

        System.out.println("Hello From Address Class!\n" +
                "street: 3942 boise ct\n" +
                "city : NY\n" +
                "city2 = CA\n" +
                "zip code : 75069\n");

// Declare if Condition: using String
//        if(city == "NY"){
//        System.out.println("NY is the city Name.");

        if (city == "NY") {
            System.out.println("NY is the city Name.");
        }

//if(city.equals(("CA"))){
//            // Code to execute if condition is true
//             System.out.println("CA is the city Name.");

        if (city2.equals(("CA"))) {
            System.out.println("CA is the city Name.");
        }


// Declare if Condition: Using  Boolean
//        if(hasStreetName){
//         Code to execute if condition is true
//         System.out.println("The Address Has Street Name.");

        if (hasStreetName) {
            System.out.println("The Address Has Street Name.");
        }
    }
}