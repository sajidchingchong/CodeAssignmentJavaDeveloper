package com.singtel.code;

public class Chicken extends Bird {
	Chicken() {
		super();
		this.canFly = false;
	}

	@Override
	void say() {
		System.out.println("Cluck, cluck");
	}
}
