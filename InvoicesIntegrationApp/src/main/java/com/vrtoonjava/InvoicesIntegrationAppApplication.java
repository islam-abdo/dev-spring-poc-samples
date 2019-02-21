package com.vrtoonjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@ComponentScan("com.vrtoonjava")
@SpringBootApplication
public class InvoicesIntegrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoicesIntegrationAppApplication.class, args);
	}

}
