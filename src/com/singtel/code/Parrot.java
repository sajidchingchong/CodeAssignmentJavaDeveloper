package com.singtel.code;

public class Parrot extends Bird {
	private ParrotType type;

	public ParrotType getType() {
		return type;
	}

	public void setType(ParrotType type) {
		this.type = type;
	}

	Parrot() {
		this.type = ParrotType.withDogs;
	}

	@Override
	void say() {
		switch (this.type) {
		case withDogs:
			System.out.println("Woof, woof");
		case withCats:
			System.out.println("Meow");
		case nearRooster:
			System.out.println("Cock-a-doodle-doo");
		}
	}
}
