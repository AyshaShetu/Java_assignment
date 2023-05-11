import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        System.out.println("What is Credit card Number?  ");
        String code = cc.nextLine();

        System.out.println("What is the Expiration date?  ");
        String date = cc.nextLine();

        System.out.println("What is the Cardholder Name?  ");
        String name = cc.nextLine();



        System.out.println(
                "Credit card Number : " + code +
                        "\nExpiration date :  " + date +
                        "\nCardholder Name :  " + name
        );
    }
}
