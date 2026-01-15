package com.xenon.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.xenon.store.entities.Address;
import com.xenon.store.entities.Profile;
import com.xenon.store.entities.Tag;
import com.xenon.store.entities.User;


@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
	    SpringApplication.run(StoreApplication.class, args);
		//var user = new User(1L, "Winner", "blessedwinner66@gmail.com", "HomeAlone123");
		//var name = user.getName();
		//System.out.println("User name: " + name);

		var user = User.builder()
		    .id(1L)
		    .name("Winner")
			.email("blessedwinner66@gmail.com")
			.password("HomeAlone123")
			.build();

		var profile = Profile.builder()
			          .bio("bio")
					  .build();

		user.setProfile(profile);
		profile.setUser(user);		  

		
		
		// var address = Address.builder()
		//               .id(101L)
		//               .street("street")
		// 			  .city("city")
		// 			  .state("state")
		// 			  .zip("zip")
		// 			  .build();
					  
	    //user.addAddress(address);

		var tag = new Tag("tag1");
		String name = tag.getName();
		user.addTag(name);

		System.out.println(user);
     }

}
