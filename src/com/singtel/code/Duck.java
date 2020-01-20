package com.singtel.code;

public class Duck extends Bird {
	Duck() {
		this.canSwim = true;
		this.canFly = true;
	}

	@Override
	void say() {
		System.out.println("Quack, quack");
	}
}
