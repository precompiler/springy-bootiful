package com.github.precompiler.getstarted.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RobotBodyConfig {
	@Bean
	public Object body() {
		System.out.println("Prepare body...");
		return "Body";
	}

}
