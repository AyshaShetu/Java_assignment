import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner med = new Scanner(System.in);

        System.out.println("What is Employee's name?");
        String name = med.nextLine();

        System.out.println("What is the Designation?");
        String post = med.nextLine();

        System.out.println("What is the Salary?");
        Double numBer = med.nextDouble();

        System.out.println(
                "Employee's Name : " + name +
                "\nDesignation :  " + post +
                "\nSalary :  " + numBer
        );
    }
}
