package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public Greeting helloParam(
		@RequestParam(value = "name", defaultValue = "World") String name
	) {
		return new Greeting("hello " + name);
	}

	@GetMapping("/hello/{name}")
	public Greeting helloPath(
		@PathVariable(value = "name") String name
	) {
		return new Greeting("hello " + name);
	}
}
