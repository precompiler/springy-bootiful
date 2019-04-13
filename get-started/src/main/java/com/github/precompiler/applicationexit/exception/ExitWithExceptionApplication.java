package com.github.precompiler.applicationexit.exception;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ExitWithExceptionApplication {
	@Bean
    CommandLineRunner randomException() {
        return args -> {
            
                throw new ExceptionWithCode();
            
        };
    }
	public static void main(String[] args) {
		SpringApplication.run(ExitWithExceptionApplication.class, args);
	}
	
	@EventListener
    public void exitEvent(ExitCodeEvent event) {
        System.out.println("Exit code: " + event.getExitCode());
    }

}
