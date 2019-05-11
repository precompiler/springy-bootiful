package com.github.precompiler.typesafeprops;

import java.net.InetAddress;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties("demo")
@Validated
@Configuration
public class DemoProperties {
	private boolean enabled;
	@NotNull
	private InetAddress hostServer;
}
