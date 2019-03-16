package com.github.precompiler.hierarchy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.github.precompiler.hierarchy.child.ChildConfig;
import com.github.precompiler.hierarchy.parent.ParentConfig;

@SpringBootApplication
public class ApplicationBuilderDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new SpringApplicationBuilder().sources(ParentConfig.class).child(ChildConfig.class)
				.run(args);
		System.out.println(ctx);
		System.out.println(ctx.getParent());
		System.out.println("===========");
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		} 
		System.out.println("===========");
		for (String beanName : ctx.getParent().getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
