package com.singtel.code;

public enum ParrotType {
	withDogs("Woof, woof"), withCats("Meow"), nearRooster("Cock-a-doodle-doo");

	private String sound;

	public String getSound() {
		return sound;
	}

	ParrotType(String sound) {
		this.sound = sound;
	}
}
