import java.util.Scanner;

public class Donation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What is Donor's name?  ");
        String name = sc.nextLine();

        System.out.println("What is the Amount?  ");
        String number = sc.nextLine();

        System.out.println("What is the Donation date?  ");
        String date = sc.nextLine();

        System.out.println(
                "Donor's name : " + name +
                        "\nAmount :  " + number +
                        "\nDonation Date :  " + date
        );
    }
}
