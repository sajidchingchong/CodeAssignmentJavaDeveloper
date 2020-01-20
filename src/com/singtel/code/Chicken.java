package com.singtel.code;

public class Chicken extends Bird {
	Chicken() {
		this.canSwim = false;
		this.canFly = false;
	}

	@Override
	void say() {
		System.out.println("Cluck, cluck");
	}
}
