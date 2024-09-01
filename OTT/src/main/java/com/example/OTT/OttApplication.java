package com.example.OTT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class OttApplication {

	//Dotenv dotenv = Dotenv.load();

	public static void main(String[] args) {
		SpringApplication.run(OttApplication.class, args);
	}




}
