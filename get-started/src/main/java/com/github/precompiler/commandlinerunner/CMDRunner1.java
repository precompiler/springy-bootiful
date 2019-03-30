package com.github.precompiler.commandlinerunner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class CMDRunner1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CMDRunner1");
		System.out.println(args);
		if (Arrays.asList(args).contains("ls")) {
			System.out.println("list files");
		}
	}

}
