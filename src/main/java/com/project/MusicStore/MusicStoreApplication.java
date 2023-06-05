package com.project.MusicStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;
@SpringBootApplication
public class MusicStoreApplication {

	public static void main(String[] args) {

		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.configure().load();

		// Set the environment variables as system properties
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(MusicStoreApplication.class, args);
	}

}
