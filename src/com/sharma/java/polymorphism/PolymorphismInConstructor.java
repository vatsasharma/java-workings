package com.sharma.java.polymorphism;

public class PolymorphismInConstructor {
	public static void main(String[] args) {
		Animal animal = new Amphibian("Frog");
	}
}

class Animal {

	void what() {
		System.out.println("Animal");
	}

	public Animal() {
		System.out.println("Before Animal what()");
		what();
		System.out.println("After Animal what()");
	}

}

class Amphibian extends Animal {
	String desc;

	void what() {
		System.out.println(desc);
		System.out.println("Amphibian");
	}

	public Amphibian(String desc) {
		this.desc = desc;
		what();
	}

}