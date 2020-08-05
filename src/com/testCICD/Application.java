package com.testCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	public String hello() {
		return "Hello from India";
	}
	public static void main(String[] args) {
		System.getProperties().setProperty("server.port", "8183");
SpringApplication.run(Application.class, args);
	}

}
