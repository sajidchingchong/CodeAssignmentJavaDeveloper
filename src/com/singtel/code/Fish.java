package com.singtel.code;

public class Fish extends Animal {
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
