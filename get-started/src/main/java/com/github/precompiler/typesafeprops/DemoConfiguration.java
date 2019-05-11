package com.github.precompiler.typesafeprops;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties({DemoProperties.class}) don't need this if DemoProperties is annotated as a bean. (Configuration, Component, Service)
public class DemoConfiguration {

}
