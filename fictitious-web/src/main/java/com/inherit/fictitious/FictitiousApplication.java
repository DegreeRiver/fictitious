package com.inherit.fictitious;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FictitiousApplication {

	public static void main(String[] args) {
		SpringApplication.run(FictitiousApplication.class, args);
	}
}
