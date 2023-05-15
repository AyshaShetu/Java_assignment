package com.MyJava.If_else_assignment;

public class CustomerReview {
    public static void main(String[] args) {
        String product = "Laptop";
        int rating = 9;
        String comment = "This is a good laptop";

        System.out.println(
                "product name = " + product +
                        "\nrating = " + rating +
                        "\ncomment = " + comment
        );

        if (product == "Laptop") {
            System.out.println("Yes, this is laptop");
        }

    }
}
