package com.github.precompiler.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BotConfiguration {
	@Profile("EN")
	@Bean
	public GreetingBot enBot() {
		return new GreetingBot("hello");
	}
	@Profile("CN")
	@Bean
	public GreetingBot cnBot() {
		return new GreetingBot("你好");
	}
	@Profile("JP")
	@Bean
	public GreetingBot jpBot() {
		return new GreetingBot("こんにちは");
	}
	
	@Profile("default")
	@Bean
	public GreetingBot defaultBot() {
		return new GreetingBot("Dia dhuit");
	}
}
