package com.singtel.code;

import java.awt.Color;

public class Shark extends Fish {
	Shark() {
		super();
		this.color = Color.GRAY;
		this.isLarge = true;
		this.makeJokes = false;
		this.eatOtherFish = true;
	}
}
