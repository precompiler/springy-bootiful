package com.github.precompiler.externalizedproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dummy {

	public Dummy(@Value("${greeting}") String greeting) {
		System.out.println(greeting);
	}
}
