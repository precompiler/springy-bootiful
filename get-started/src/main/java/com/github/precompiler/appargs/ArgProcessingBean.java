package com.github.precompiler.appargs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgProcessingBean {
	public ArgProcessingBean(ApplicationArguments args) {
		boolean demo = args.containsOption("demo");
		System.out.println(demo);

		System.out.println(args.getOptionValues("demo"));
		System.out.println(args.getNonOptionArgs());
		// --demo=hello files=["1.txt","2.pdf"]
	}
}
