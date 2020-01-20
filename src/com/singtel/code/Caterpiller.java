package com.singtel.code;

public class Caterpiller extends Butterfly {
	Caterpiller() {
		super();
		this.isCaterpiller = true;
		this.canFly = false;
	}

	@Override
	void walk() {
		System.out.println("I am walking");
	}
}
