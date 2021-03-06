package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DolphinTest {

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
		Animal dolphin = new Dolphin();
		assertFalse(dolphin.canFly(), "Dolphin don't fly");
		assertFalse(dolphin.canWalk(), "Dolphin don't walk");
		assertFalse(dolphin.canSing(), "Dolphin don't sing");
		assertTrue(dolphin.canSwim(), "Dolphin can swim");
	}

}
