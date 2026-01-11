package com.xenon.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		// OrderService orderService = new OrderService(new StripePaymentService());
        // orderService.placeOrder();

		//OrderService orderService = new OrderService(new PaypalPaymentService());
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
		context.close();
	}

}
