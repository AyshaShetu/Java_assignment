import java.util.Scanner;
public class comment {
    public static void main(String[] args) {
        Scanner talk = new Scanner(System.in);

        System.out.println("What is Author's name?  ");
        String name = talk.nextLine();

        System.out.println("What is the content?  ");
        String content = talk.nextLine();

        System.out.println("What is the date?  ");
        String date = talk.nextLine();

        System.out.println(

                "Author's Name : " + name +
                "\nContent :  " + content +
                "\nDate :  " + date
        );
    }
}
