package com.example;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(250.75);
        Payment p2 = new CashOnDelivery(120.00 , "123 Main St, Cityville");

        p1.process();
        System.out.println("-------------------");
        p2.process();
    }
}
