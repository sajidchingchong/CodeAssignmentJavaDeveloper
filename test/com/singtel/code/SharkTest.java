package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SharkTest {

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
		Fish shark = new Shark();
		assertFalse(shark.canFly(), "Shark don't fly");
		assertFalse(shark.canWalk(), "Shark don't walk");
		assertFalse(shark.canSing(), "Shark don't sing");
		assertTrue(shark.canSwim(), "Shark can swim");

		assertTrue(shark.getColor() == Color.GRAY, "Shark is gray");
		assertTrue(shark.isLarge(), "Shark is large");
		assertFalse(shark.makeJokes(), "Shark don't make jokes");
		assertTrue(shark.eatOtherFish(), "Shark eat other fish");
	}

}
