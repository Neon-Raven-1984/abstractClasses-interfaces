package com.example;

import java.time.LocalDateTime;
//پرداخت

public abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void logTransaction() {
        System.out.println("📅 Date: " + LocalDateTime.now());
        System.out.println("💰 Amount: " + amount);
    }

    public abstract void process();
}
