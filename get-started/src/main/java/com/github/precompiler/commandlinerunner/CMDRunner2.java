package com.github.precompiler.commandlinerunner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class CMDRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CMDRunner2");
		System.out.println(args);
		if (Arrays.asList(args).contains("deploy")) {
			System.out.println("Deploy logic");
		}
	}

}
