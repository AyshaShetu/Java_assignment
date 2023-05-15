package com.MyJava.If_else_assignment;

public class InventoryItem {
    public static void main(String[] args) {
        String name = "cake";
        int quantity = 15;
        String location = "bakery";

        System.out.println("info of InventoryItem Class!\n" +
                "name: cake\n" +
                "quantity: 5\n" +
                "location: bakery");

        if(quantity < 10){
            System.out.println("Inventory Items  has to be less  than 10!");
        }

        else{
            System.out.println("Inventory Items are now : "+quantity);
        }
    }
}
