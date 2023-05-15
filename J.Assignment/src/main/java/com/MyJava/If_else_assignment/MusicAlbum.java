package com.MyJava.If_else_assignment;

public class MusicAlbum {
    public static void main(String[] args) {

        int track = 10;


        System.out.println("info of MusicAlbum Class!\n" +
                "title: fine line\n" +
                "artist: Harry Styles\n" +
                "track:\n" +
                "1: watermelon sugar\n" +
                "2: she\n" +
                "3: golden\n" +
                "4: cherry");

        if (track == 5) {
            System.out.println("Complete Album");
        } else {
            System.out.println("Not good");
        }
    }
}
