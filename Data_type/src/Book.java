// Book - A class representing a book with properties like title, author, and ISBN.
// Declare the Class Name: Book
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above
// take input from user for value of each variable
// Print all variables declared above

import java.util.Scanner;
public class Book {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);

        System.out.println("Title of the Book :  ");
        String BookName = letter.nextLine();

        System.out.println("Name of the Author :  ");
        String AuthorName = letter.nextLine();

        System.out.println("ISBN : ");
        int IsBN = letter.nextInt();

        System.out.println(
                "Book name :  " + BookName +
                "\nAuthor name :  " + AuthorName +
                "\nISBN number :  "  + IsBN
        );
    }

}