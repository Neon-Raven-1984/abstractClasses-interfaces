package com.example;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void process() {
        logTransaction();
        System.out.println("🚚 Cash on Delivery selected.");
        System.out.println("📦 Payment will be collected at delivery address.");
    }
}
