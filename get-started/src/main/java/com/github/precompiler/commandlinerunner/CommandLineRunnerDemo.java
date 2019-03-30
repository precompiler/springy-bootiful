package com.github.precompiler.commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerDemo {
	public static void main(String[] args) {
		System.out.println("Start application...");
		SpringApplication.run(CommandLineRunnerDemo.class, args);
	}
}
