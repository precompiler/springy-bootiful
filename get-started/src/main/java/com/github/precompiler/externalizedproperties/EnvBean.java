package com.github.precompiler.externalizedproperties;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvBean {
	public EnvBean(Environment env) {
		System.out.println("++++++++++++++++++");
		System.out.println(env.getProperty("foo"));
		System.out.println("++++++++++++++++++");
	}
}
