package com.singtel.code;

public class Animal {
	protected boolean canSwim;

	public boolean canSwim() {
		return canSwim;
	}

	void walk() {
		System.out.println("I am walking");
	}

	void sing() {
		System.out.println("I am singing");
	}
}
