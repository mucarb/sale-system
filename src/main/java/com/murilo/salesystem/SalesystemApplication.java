package com.murilo.salesystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SalesystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
