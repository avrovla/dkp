package com.avrovla.dkp.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class HomeControllerTests {

	private HomeController ctrl = new HomeController();

	@BeforeAll
	static void setUp() {

	}

	@Test
	void contextLoads() {

		var result = ctrl.get();
		assertTrue(ctrl.get().equalsIgnoreCase("Hello world!"));
	}

}
