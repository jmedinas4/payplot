package com.payplot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PayplotAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayplotAppApplication.class, args);
	}

}
