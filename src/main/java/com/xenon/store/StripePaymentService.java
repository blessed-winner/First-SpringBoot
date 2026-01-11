package com.xenon.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;

//@Service("stripe")
public class StripePaymentService implements PaymentService{
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.supported-currencies}")
    private List<String> currencies;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Override
    public void processPayment(double amount){
    
        System.out.println("\nSTRIPE");
        System.out.println("API-URL: " + apiUrl);
        System.out.println("ENABLED: " + enabled);
        System.out.println("CURRENCIES: " + currencies);
        System.out.println("TIMEOUT: " + timeout);
        System.out.println("Payment issued: $" + amount);
    }
}