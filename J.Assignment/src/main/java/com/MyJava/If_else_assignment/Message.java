package com.MyJava.If_else_assignment;

public class Message {
    public static void main(String[] args) {
        String sender = "inactive";
        String receiver = "active";
        System.out.println("info of Message Class!\n" +
                "sender: active\n" +
                "receiver: active\n" +
                "content properties: java tutorial link from youtube");

        if (sender == "active") {
            System.out.println("you can send message");
        } else {
            System.out.println("check connection");
        }
    }
}