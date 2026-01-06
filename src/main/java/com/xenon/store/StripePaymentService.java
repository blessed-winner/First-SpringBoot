package com.xenon.store;

public class StripePaymentService implements PaymentService{

    @Override
    public void processPayment(double amount){
    
        System.out.println("\nStripe payment chosen.");
         System.out.println("Payment issued: $" + amount);
    }
}