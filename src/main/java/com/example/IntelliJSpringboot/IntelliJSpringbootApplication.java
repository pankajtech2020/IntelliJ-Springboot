package com.example.IntelliJSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class IntelliJSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelliJSpringbootApplication.class, args);
		System.out.println("Pankaj"+new Date());
	}

}
