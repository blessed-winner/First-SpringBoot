package com.xenon.store;
import org.springframework.stereotype.Service;

@Service
public class OrderService{

    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

   public void placeOrder(){
        paymentService.processPayment(1000);
   }
}