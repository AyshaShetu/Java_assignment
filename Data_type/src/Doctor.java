import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {

        Scanner med = new Scanner(System.in);

        System.out.println("What is Doctor's name?");
        String name = med.nextLine();

        System.out.println("What is the specification?");
        String child = med.nextLine();

        System.out.println("What is the Contact Information?");
        String numBer = med.nextLine();

        System.out.println(
                "Doctor's Name : " + name +
                        "\nSpecification :  " + child +
                        "\nPhone Number :  " + numBer
        );
    }
}
