package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(SpringBootAppApplication.class, args);
	context.close();
	}

}
