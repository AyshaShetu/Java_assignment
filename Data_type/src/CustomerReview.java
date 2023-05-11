import java.util.Scanner;

public class CustomerReview {
    public static void main(String[] args) {

        Scanner talk = new Scanner(System.in);

        System.out.println("What is Product?");
        String name = talk.nextLine();

        System.out.println("What is the Rating?");
        String rating = talk.nextLine();

        System.out.println("What is the Comments?");
        String note = talk.nextLine();

        System.out.println(
                "Product Name : " + name +
                        "\nRating :  " + rating +
                        "\nComments :  " + note
        );
    }
}
