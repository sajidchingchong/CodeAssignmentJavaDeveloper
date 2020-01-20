package com.singtel.code;

public class Butterfly extends Bird {
	protected boolean isCaterpiller = false;

	public boolean isCaterpiller() {
		return isCaterpiller;
	}

	Butterfly() {
		super();
		this.canSing = false;
	}

	@Override
	void say() {
		System.out.println("I don't make a sound");
	}
}
