package com.xenon.store;

//import org.springframework.stereotype.Service;

//@Service("paypal")
public class PaypalPaymentService implements PaymentService {
      @Override
    public void processPayment(double amount){
        System.out.println("\nPAYPAL");
        System.out.println("Payment issued: $" + amount);
    }
}
