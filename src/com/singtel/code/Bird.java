package com.singtel.code;

public class Bird extends Animal {
	protected boolean canSwim;

	protected boolean canFly;

	public boolean canSwim() {
		return canSwim;
	}

	public boolean canFly() {
		return canFly;
	}

	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}

	void say() {
		System.out.println("I am saying");
	}
}
