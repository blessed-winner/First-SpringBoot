package com.xenon.store;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Service
public class OrderService{

    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    @PostConstruct
    public void init(){
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("OrderService cleanup");
    }

   public void placeOrder(){
        paymentService.processPayment(1000);
   }
}