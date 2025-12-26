package com.example;
//پرداخت در محل
//این هم یک نوع پرداخت است
//ولی نیاز به امنیت خاصی ندارد


public class CashOnDelivery extends Payment {
    private final String address;

    public CashOnDelivery(double amount, String address) {
        super(amount);
        this.address = address;
    }

    @Override
    public void process() {
        logTransaction();
        System.out.println("🚚 Cash on Delivery selected.");
        System.out.println("📦 Payment will be collected at delivery address: " + address);
    }
}
