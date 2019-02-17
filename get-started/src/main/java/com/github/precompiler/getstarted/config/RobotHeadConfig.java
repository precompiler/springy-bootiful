package com.github.precompiler.getstarted.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RobotHeadConfig {
	@Bean
	public Object head() {
		System.out.println("Prepare head...");
		return "Head";
	}
}
