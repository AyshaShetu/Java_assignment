// Charity - A class representing a charity with properties like name, mission, and donations.
// Declare the Class Name: Charity
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above
// take input from user for value of each variable
// Print all variables declared above

import java.util.Scanner;
public class Charity {
    public static void main(String[] args) {
        Scanner donate = new Scanner(System.in);

        System.out.println("Name of the charity : ");
        String charityName = donate.nextLine();

        System.out.println("Name of the mission : ");
        String MissionName = donate.nextLine();

        System.out.println("Amount of Donation : ");
        double donation = donate.nextDouble();


        System.out.println("Charity name :  " + charityName +
                "\nMission name :  " + MissionName +
                "\nDonation:  " + donation);
    }
}
