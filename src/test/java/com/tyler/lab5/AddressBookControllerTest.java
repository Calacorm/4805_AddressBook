package com.tyler.lab5;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {AddressBookApp.class})
public class AddressBookControllerTest {

	@Test
	public void whenSpringContextIsBootstrapped_thenNoExceptions() {
		//AKA Context Loads
	}
}
