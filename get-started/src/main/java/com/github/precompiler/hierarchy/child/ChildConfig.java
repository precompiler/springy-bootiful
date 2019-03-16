package com.github.precompiler.hierarchy.child;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.precompiler.hierarchy.parent.ParentBean;

@Configuration
public class ChildConfig {
	@Bean
	public ChildBean childBean(ParentBean pb) {
		return new ChildBean();
	}
}
