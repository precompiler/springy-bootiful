package com.github.precompiler.getstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GetStartedApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GetStartedApplication.class, args);
		for( String name : ctx.getBeanNamesForType(String.class)) {
			System.out.println(name);
		}
	}

}
