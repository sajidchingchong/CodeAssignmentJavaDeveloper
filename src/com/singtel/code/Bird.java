package com.singtel.code;

public class Bird extends Animal {
	protected boolean canFly;

	public boolean canFly() {
		return canFly;
	}

	void fly() {
		if (this.canFly)
			System.out.println("I am flying");
		else
			System.out.println("I don't fly");
	}

	void say() {
		System.out.println("I am saying");
	}
}
