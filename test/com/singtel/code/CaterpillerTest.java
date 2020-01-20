package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaterpillerTest {

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
		Butterfly caterpiller = new Caterpiller();
		assertFalse(caterpiller.canFly(), "Caterpiller don't fly");
		assertTrue(caterpiller.canWalk(), "Caterpiller can walk");
		assertFalse(caterpiller.canSing(), "Caterpiller don't sing");
		assertFalse(caterpiller.canSwim(), "Caterpiller don't swim");

		assertTrue(caterpiller.isCaterpiller(), "I am a caterpiller");
	}

}
