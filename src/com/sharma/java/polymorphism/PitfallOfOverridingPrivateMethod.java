package com.sharma.java.polymorphism;

public class PitfallOfOverridingPrivateMethod {
	public static void main(String[] args) {
		Parent.main(args);
	}

}

class Parent {
	
	int field;

	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
	}

	private void print() {
		System.out.println("private method from  parent");
	}

}

class Child extends Parent {

	public void print() {
		System.out.println("child method");
	}

}