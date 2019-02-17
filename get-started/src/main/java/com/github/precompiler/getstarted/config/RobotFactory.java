package com.github.precompiler.getstarted.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class RobotFactory {
	@Bean
	@DependsOn(value= {"head", "body"})
	public String robot(@Qualifier("head") String head, @Qualifier("body")String body) {
		String robot = "Robot:" + head + "=" + body;
		System.out.println(robot);
		return robot;
	}
}
