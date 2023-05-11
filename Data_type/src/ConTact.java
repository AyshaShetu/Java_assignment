
import java.util.Scanner;
public class ConTact {
    public static void main(String[] args) {

    Scanner talk = new Scanner(System.in);

        System.out.println("What is name?");
    String name = talk.nextLine();

        System.out.println("What is the email?");
    String emaIl = talk.nextLine();

        System.out.println("What is the phone number?");
    String numBer = talk.nextLine();

        System.out.println(
                "Name : " + name +
            "\nEmail :  " + emaIl +
            "\nPhone Number :  " + numBer
    );
}
}

