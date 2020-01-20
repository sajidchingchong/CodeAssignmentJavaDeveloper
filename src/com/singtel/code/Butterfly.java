package com.singtel.code;

public class Butterfly extends Bird {
	Butterfly() {
		super();
		this.canFly = true;
	}

	@Override
	void sing() {
		System.out.println("I don't make a sound");
	}

	@Override
	void say() {
		System.out.println("I don't make a sound");
	}
}
