package com.github.precompiler.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsDemoApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(EventsDemoApplication.class);
		application.addListeners(new DemoApplicationListener(), new AnotherEventListener());
		application.run(args);
	}
}
