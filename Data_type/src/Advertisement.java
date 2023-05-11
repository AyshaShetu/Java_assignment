// Advertisement - A class representing an advertisement with properties like title, description, and target audience.
// Declare the Class Name: Advertisement
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above and also initilize them
// String title = "IzaanSchool";
// Print all variables declared above
// Declare  boolean variables isSponsored, isFeatured and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable
public class Advertisement {
    public static void main(String[] args) {

                String title = "IzaanSchool";
                String Description = "Java class";
                int targetAudience = 1000;

        System.out.println("title :" + title);
        System.out.println("Description :" + Description);
        System.out.println("target Audience :" + targetAudience);

        boolean isSponsored = false;
        boolean isFeatured = true;

        System.out.println(
                "IzaanSchool is sponsored : " + isSponsored +
                "\nIzaanSchool is featured : " + isFeatured
        );
    }
}
