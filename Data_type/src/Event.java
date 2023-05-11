import java.util.Scanner;

public class Event {
    public static void main(String[] args) {

        Scanner med = new Scanner(System.in);

        System.out.println("What is Event's name?");
        String name = med.nextLine();

        System.out.println("What is the Date?");
        String date = med.nextLine();

        System.out.println("What is the location?");
        String place = med.nextLine();

        System.out.println(
                "Name : " + name +
                "\nDate :  " + date +
                "\nlocation :  " + place
        );
    }
}
