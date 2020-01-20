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
		assertTrue(shark.isLarge(), "Sharks are large");
		assertTrue(shark.getColor() == Color.GRAY, "Sharks are grey");
		assertFalse(shark.makeJokes(), "Sharks don't make jokes");
		assertTrue(shark.eatOtherFish(), "Sharks eat other fish");
	}

}
