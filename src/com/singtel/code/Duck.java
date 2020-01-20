package com.singtel.code;

public class Duck extends Bird {
	Duck() {
		super();
		this.canSwim = true;
	}

	@Override
	void say() {
		System.out.println("Quack, quack");
	}
}
