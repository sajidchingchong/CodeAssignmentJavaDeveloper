package com.singtel.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClownfishTest {

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
		Fish clownfish = new Clownfish();
		assertFalse(clownfish.isLarge(), "Clownfish are small");
		assertTrue(clownfish.getColor() == Color.ORANGE, "Clownfish are orange");
		assertTrue(clownfish.makeJokes(), "Clownfish make jokes");
		assertFalse(clownfish.eatOtherFish(), "Clownfish don't eat other fish");
	}

}
