// Appointment - A class representing an appointment with properties like date, time, and location.
// Declare the Class Name: Appointment
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above and also initilize them
// Print all variables declared above
// Declare  boolean variables completed, rescheduled and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable

public class AppoIntment {
    public static void main(String[] args) {
       String date = "5/8/2023\n";
        String time = "06:00 pm\n" ;
        String location = "Doctor Office";

        System.out.println(
                "Date : " + date +
                "Time : " + time +
                "Location : " + location
        );
        boolean completed = true;
        boolean rescheduled = false;

        System.out.println(
                "Appointment is completed: " + completed +
                 "\nrescheduled appointment : " + rescheduled
        );
    }
}
