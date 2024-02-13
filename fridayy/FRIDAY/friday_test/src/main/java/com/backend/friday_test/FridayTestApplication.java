package com.backend.friday_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FridayTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridayTestApplication.class, args);
	}

}
