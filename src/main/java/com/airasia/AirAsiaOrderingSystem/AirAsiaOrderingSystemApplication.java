package com.airasia.AirAsiaOrderingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AirAsiaOrderingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirAsiaOrderingSystemApplication.class, args);
		log.info("Application started successfully.");
	}

}
