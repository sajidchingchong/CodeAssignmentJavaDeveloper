package com.singtel.code;

import java.awt.Color;

public class Fish extends Animal {
	protected boolean isLarge;

	protected Color color = Color.WHITE;

	protected boolean makeJokes;

	protected boolean eatOtherFish;

	public boolean isLarge() {
		return isLarge;
	}

	public Color getColor() {
		return color;
	}

	public boolean makeJokes() {
		return makeJokes;
	}

	public boolean eatOtherFish() {
		return eatOtherFish;
	}

	Fish() {
		this.canSwim = true;
	}

	@Override
	void sing() {
		System.out.println("I don't sing");
	}

	@Override
	void walk() {
		System.out.println("I don't walk");
	}
}
