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
