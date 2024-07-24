package com.coderscampus.assigment10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Assigment10Application {

	public static void main(String[] args) {
		SpringApplication.run(Assigment10Application.class, args);
	}

}
