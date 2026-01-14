package com.xenon.store;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xenon.store.entities.User;


@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
	    //SpringApplication.run(StoreApplication.class, args);
		//var user = new User(1L, "Winner", "blessedwinner66@gmail.com", "HomeAlone123");
		//var name = user.getName();
		//System.out.println("User name: " + name);

		User.builder()
		    .name("Winner")
			.email("blessedwinner66@gmail.com")
			.password("HomeAlone123");
     }

}
