package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChickenTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void test() {
		Bird chicken = new Chicken();
		chicken.say();
		assertFalse(chicken.canFly(), "Chicken don't fly");
		assertTrue(chicken.canWalk(), "Chicken can walk");
		assertTrue(chicken.canSing(), "Chicken can sing");
		assertFalse(chicken.canSwim(), "Chicken don't swim");
	}

}
