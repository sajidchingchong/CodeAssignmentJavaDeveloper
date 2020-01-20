package com.singtel.code;

import java.awt.Color;

public class Fish extends Animal {
	protected Color color = Color.WHITE;

	protected boolean isLarge = false;

	protected boolean makeJokes = false;

	protected boolean eatOtherFish = false;

	public Color getColor() {
		return color;
	}

	public boolean isLarge() {
		return isLarge;
	}

	public boolean makeJokes() {
		return makeJokes;
	}

	public boolean eatOtherFish() {
		return eatOtherFish;
	}

	Fish() {
		super();
		this.canWalk = false;
		this.canSwim = true;
	}
}
