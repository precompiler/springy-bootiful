package com.github.precompiler.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class AnotherEventListener implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Context closed...");
		System.out.println(event);
	}

}
