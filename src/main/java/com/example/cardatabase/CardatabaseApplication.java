package com.example.cardatabase;

import org.springframework.beans.factory.annotation.Autowired; // enabling dependency injection
import org.springframework.boot.CommandLineRunner; // for executing additional code before the application starts
import org.springframework.context.annotation.Bean; // for java bean notation
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarRepository; // injecting repository class


@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository repository;
	
	public static void main(String[] args) {
		// Hellooo, after adding the comment application is started
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			// saving demo data to the database
			
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000));
			repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000));
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO--212", 2018, 39000));
			
		
		};
	}
	
}
