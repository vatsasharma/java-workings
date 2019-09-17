package com.sharma.java.polymorphism;

public class CovariantReturnType {

	public static void main(String[] args) {
		Lake lake = new Lake();
		Animal1 animal = lake.has();
		System.out.println(animal);

		lake = new FreshwaterLake();
		animal = lake.has();
		System.out.println(animal);
	}

}

class Animal1 {
	public String toString() {
		return "Animal";
	}
}

class Amphibhian extends Animal1 {

	public String toString() {
		return "Amphibian";
	}
}

class Lake {
	Animal1 has() {
		return new Animal1();
	}
}

class FreshwaterLake extends Lake {
	Amphibhian has() {
		return new Amphibhian();
	}
}