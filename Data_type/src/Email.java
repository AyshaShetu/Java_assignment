import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner talk = new Scanner(System.in);

        System.out.println("What is Sender's name?  ");
        String name = talk.nextLine();

        System.out.println("What is Recipient's name?  ");
        String name2 = talk.nextLine();

        System.out.println("What is the subject?  ");
        String sub = talk.nextLine();

        System.out.println("What is the body?  ");
        String description = talk.nextLine();

        System.out.println(

                "Sender's Name : " + name +
                "\nRecipient's Name :  " +name2 +
                "\nsubject :  " + sub +
                "\nbody :  " + description
        );
    }
}
