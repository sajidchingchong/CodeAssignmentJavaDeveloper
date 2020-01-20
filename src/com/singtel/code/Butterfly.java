package com.singtel.code;

public class Butterfly extends Bird {
	protected boolean isCaterpiller = false;

	public boolean isCaterpiller() {
		return isCaterpiller;
	}

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
