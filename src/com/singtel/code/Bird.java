package com.singtel.code;

public class Bird extends Animal {
	protected boolean canFly;

	public boolean canFly() {
		return canFly;
	}

	void fly() {
		System.out.println("I am flying");
	}

	void say() {
		System.out.println("I am saying");
	}
}
