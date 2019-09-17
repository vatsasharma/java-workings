package com.sharma.java.polymorphism;

public class StaticInPolymorphism {

	public static void main(String[] args) {
		StaticSuper sup = new StaticDerived();
		sup.print();
		System.out.println("value: " + sup.field);
	}

}

class StaticSuper {

	static int field = 0;

	static void print() {
		System.out.println("From Super");
		System.out.println(getValue());
	}

	static int getValue() {
		return field;
	}

}

class StaticDerived extends StaticSuper {

	static int field = 10;

	static void print() {
		System.out.println("From Derived");
		System.out.println(getValue());
	}

	static int getValue() {
		return field;
	}

}