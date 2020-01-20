package com.singtel.code;

public class Solution {
	private static Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
			new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
			new Cat() };

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		System.out.println("Animals that can fly: " + countFly());
		System.out.println("Animals that can walk: " + countWalk());
		System.out.println("Animals that can sing: " + countSing());
		System.out.println("Animals that can swim: " + countSwim());
	}

	private static int countFly() {
		int count = 0;
		for (Animal animal : animals)
			if (animal.canFly())
				count++;
		return count;
	}

	private static int countWalk() {
		int count = 0;
		for (Animal animal : animals)
			if (animal.canWalk())
				count++;
		return count;
	}

	private static int countSing() {
		int count = 0;
		for (Animal animal : animals)
			if (animal.canSing())
				count++;
		return count;
	}

	private static int countSwim() {
		int count = 0;
		for (Animal animal : animals)
			if (animal.canSwim())
				count++;
		return count;
	}
}
