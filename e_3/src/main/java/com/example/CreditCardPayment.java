package com.example;
//خرید آنلاین
public class CreditCardPayment extends Payment implements SecureTransaction {

    public CreditCardPayment(double amount) {
        super(amount);
    }
//احراز هویت
    @Override
    public boolean authenticate() {
        System.out.println("🔐 Authenticating credit card...");
        return true; // شبیه‌سازی موفق بودن احراز هویت
    }
//انجام عملیات
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
