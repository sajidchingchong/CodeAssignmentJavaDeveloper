package com.singtel.code;

import java.awt.Color;

public class Shark extends Fish {
	Shark() {
		super();
		this.isLarge = true;
		this.color = Color.GRAY;
		this.makeJokes = false;
		this.eatOtherFish = true;
	}
}
