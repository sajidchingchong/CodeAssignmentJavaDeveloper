package com.singtel.code;

public class Parrot extends Bird {
	private ParrotType type = ParrotType.withDogs;

	public ParrotType getType() {
		return type;
	}

	public void setType(ParrotType type) {
		this.type = type;
	}

	Parrot() {
		super();
	}

	@Override
	void say() {
		System.out.println(this.type.getSound());
	}
}
