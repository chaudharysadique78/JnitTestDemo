package com.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingDemoApplicationTests {
	
	private Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		
		int expected=35;
		int actual = c.doSum(10, 15,10);
		assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void testProduct() {
		
		int expected=6;
		int actual = c.doProduct(2,3);
		assertThat(actual).isEqualTo(expected);
	}

}
