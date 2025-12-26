package com.example;

public class CreditCardPayment extends Payment implements SecureTransaction {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean authenticate() {
        System.out.println("🔐 Authenticating credit card...");
        return true; // شبیه‌سازی موفق بودن احراز هویت
    }

    @Override
    public void process() {
        logTransaction();

        if (authenticate()) {
            System.out.println("✅ Credit card payment processed successfully.");
        } else {
            System.out.println("❌ Authentication failed. Payment canceled.");
        }
    }
}
