package com.MyJava.If_else_assignment;

public class Prescription {
    public static void main(String[] args) {
        int dosage = 10;

        System.out.println("info of Prescription Class!\n" +
                "patient : Willy\n" +
                "medication : antibiotic\n" +
                "dosage : 5ml, once a day\n" +
                "date : 09/09/22");

        if (dosage < 10){
            System.out.println("it is normal");
        }

        else {
            System.out.println("seems serious");
        }
    }
}
