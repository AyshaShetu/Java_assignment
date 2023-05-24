package com.MyJava.methodAssignment;

import java.util.Date;

public class GiftCard {
    private int code;
    private  double balance;
    private Date expDate;


    public int getCode(){
        return  code;
    }
    public void setCode(int code){
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getExpDate() {
        return expDate;
    }
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }


    public static void main(String[] args) {
        GiftCard obj = new GiftCard();
        obj.setCode(1234567890);
        obj.setBalance(50.00);
        obj.setExpDate(new Date());

        System.out.println(
                "GiftCard code : " + obj.getCode() +
                        "\nbalance : " + obj.getBalance() +
                        "\nExp date : " + obj.getExpDate()
        );
    }
}
