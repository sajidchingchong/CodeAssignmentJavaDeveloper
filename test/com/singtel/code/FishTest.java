package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FishTest {

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
		Fish fish = new Fish();
		assertFalse(fish.canFly(), "I don't fly");
		assertFalse(fish.canWalk(), "I don't walk");
		assertFalse(fish.canSing(), "I don't sing");
		assertTrue(fish.canSwim(), "I can swim");

		assertTrue(fish.getColor() == Color.WHITE, "I am white");
		assertFalse(fish.isLarge(), "I am small");
		assertFalse(fish.makeJokes(), "I don't make jokes");
		assertFalse(fish.eatOtherFish(), "I don't eat other fish");
	}

}
