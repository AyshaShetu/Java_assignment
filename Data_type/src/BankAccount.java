// BankAccount - A class representing a bank account with properties like account number, balance, and owner.
// Declare the Class Name: BankAccount
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above and also initilize them
// Print all variables declared above
// Declare  boolean variables isActive, isClosed and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable

public class BankAccount {
    public static void main(String[] args) {
        int account_number = 876543210;
        double balance = 51876.66;
        String owner = "Aysheen";

        boolean isActive = true;
        boolean isClosed = false;

        System.out.println(
                "Account number : " + account_number +
                        "\nBalance : " + balance +
                "\nOwner's name : " + owner +

                        "\nThis Account is active. = "    + isActive +
                        "\nThis Account is closed. = "    + isClosed
                );
    }
}
