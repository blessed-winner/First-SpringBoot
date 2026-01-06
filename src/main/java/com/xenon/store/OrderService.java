package com.xenon.store;

public class OrderService{
   public void placeOrder(){
        StripePaymentService payment = new StripePaymentService();
        payment.placePayment(1000);
   }
}