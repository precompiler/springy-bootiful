package com.github.precompiler.hierarchy.parent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.precompiler.hierarchy.child.ChildBean;

@Configuration
public class ParentConfig {
	@Bean
	public ParentBean parentBeanA() {
		return new ParentBean();
	}
}
