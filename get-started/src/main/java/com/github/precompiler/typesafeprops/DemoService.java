package com.github.precompiler.typesafeprops;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	private DemoProperties demoProperties;

	public DemoService(DemoProperties demoProperties) {
		this.demoProperties = demoProperties;
		System.out.println(demoProperties.getHostServer());
		System.out.println(demoProperties.isEnabled());
	}
}
