package com.singtel.code;

public class Animal {
	protected boolean canFly = false;

	protected boolean canWalk = true;

	protected boolean canSing = false;

	protected boolean canSwim = false;

	public boolean canFly() {
		return canFly;
	}

	public boolean canWalk() {
		return canWalk;
	}

	public boolean canSing() {
		return canSing;
	}

	public boolean canSwim() {
		return canSwim;
	}

	void fly() {
		if (this.canFly)
			System.out.println("I am flying");
		else
			System.out.println("I cannot fly");
	}

	void walk() {
		if (this.canWalk)
			System.out.println("I am walking");
		else
			System.out.println("I cannot walk");
	}

	void sing() {
		if (this.canSing)
			System.out.println("I am singing");
		else
			System.out.println("I cannot sing");
	}

	void swim() {
		if (this.canSwim)
			System.out.println("I am swimming");
		else
			System.out.println("I cannot swim");
	}

	void say() {
		System.out.println("I am saying");
	}
}
