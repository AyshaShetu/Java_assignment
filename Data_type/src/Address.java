// Address - A class representing an address with street, city, and zip code properties. Print street, city, and zip codes.
// Declare Address Class
// Declare Main Method
// Print Address
// Declaring  boolean variables hasStreetName, hasApartment and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable
// System.out.println("Has Apartment:  " + hasApartment);
public class Address {
    public static void main(String[] args) {
        String street = "street: 3942 boise ct";
        String city = "coppel";
        String zipcode = "75069";

        System.out.println("street: 3942 boise ct\n" +
                "city : coppel\n" +
                "zip code : 75069\n");

        boolean hasAptName = false;
        boolean hasStreetName = true;
        System.out.println("Has Apartment: " + hasAptName +
                "\nHas Street address: " + hasStreetName

        );
    }
}
