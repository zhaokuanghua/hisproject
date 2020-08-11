package com.neuedu.his;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@ComponentScan("com.neuedu.his")

public class HisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisApplication.class, args);
	}

}
