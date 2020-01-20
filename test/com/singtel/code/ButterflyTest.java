package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ButterflyTest {

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
		Butterfly butterfly = new Butterfly();
		assertTrue(butterfly.canFly(), "Butterfly can fly");
		assertTrue(butterfly.canWalk(), "Butterfly can walk");
		assertFalse(butterfly.canSing(), "Butterfly don't sing");
		assertFalse(butterfly.canSwim(), "Butterfly don't swim");

		assertFalse(butterfly.isCaterpiller(), "I am not a caterpiller");
	}

}
