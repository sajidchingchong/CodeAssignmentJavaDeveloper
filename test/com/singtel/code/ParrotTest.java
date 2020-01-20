package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParrotTest {

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
		Parrot parrot = new Parrot();
		parrot.say();
		parrot.setType(ParrotType.withCats);
		parrot.say();
		parrot.setType(ParrotType.nearRooster);
		parrot.say();

		assertTrue(parrot.canFly(), "Parrot can fly");
		assertTrue(parrot.canWalk(), "Parrot can walk");
		assertTrue(parrot.canSing(), "Parrot can sing");
		assertFalse(parrot.canSwim(), "Parrot don't swim");
	}

}
