package com.xenon.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
      @Override
    public void processPayment(double amount){
    
        System.out.println("\npaypal payment chosen.");
        System.out.println("Payment issued: $" + amount);
    }
}
