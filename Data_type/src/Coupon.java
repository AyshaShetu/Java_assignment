import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is Coupon code?  ");
        String code = sc.nextLine();

        System.out.println("What is the Discount Amount?  ");
        String number = sc.nextLine();

        System.out.println("What is the date?  ");
        String date = sc.nextLine();

        System.out.println(
                "Coupon code : " + code +
                        "\nDiscount Amount :  " + number +
                        "\nExpiration Date :  " + date
        );
    }
}

