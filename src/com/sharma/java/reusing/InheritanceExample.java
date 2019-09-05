package com.sharma.java.reusing;

public class InheritanceExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // Upcasting more specific to more generic
		System.out.println(parent.i);// members can't be overridden
		System.out.println(parent.getI());
	}

}

class Parent {
	public int i = 0;

	public int getI() {
		return i;
	}

}

class Child extends Parent {
	public int i = 10;

	public int getI() {
		return i;
	}

}