package com.myapp.product;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	Productcontroller pc;
	@Test
	void contextLoads() {
	}
	@Test
	public void test() {
		assertNotNull(pc.get());
	}

}
