package com.github.precompiler.applicationexit.exitcode;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ExitApplication {
	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> -1;
	}
	
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(ExitApplication.class, args)));
	}
	
	@EventListener
    public void exitEvent(ExitCodeEvent event) {
        System.out.println("Exit code: " + event.getExitCode());
    }
}
