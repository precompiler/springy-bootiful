package com.github.precompiler.externalizedproperties;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Dummy.class})
@TestPropertySource(properties = {"greeting=test-prop"})
public class DummyTest {
	
	@Test
	public void test() {
		
	}

}
