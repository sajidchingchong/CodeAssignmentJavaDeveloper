package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoosterTest {

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
		Chicken rooster = new Rooster();
		rooster.say();
		assertFalse(rooster.canFly(), "Rooster don't fly");
		assertTrue(rooster.canWalk(), "Rooster can walk");
		assertTrue(rooster.canSing(), "Rooster can sing");
		assertFalse(rooster.canSwim(), "Rooster don't swim");
	}

}
