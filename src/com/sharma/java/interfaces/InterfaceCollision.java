package com.sharma.java.interfaces;

public class InterfaceCollision {

	public static void main(String[] args) {
		//new C1();
	}
}

interface I1 {
	void f();
}

interface I2 {
	int f();

	int f(int i);
}

// Interface collision
//class C1 implements I1, I2 {
//
//	@Override
//	public int f() {
//		return 0;
//	}
//
//	@Override
//	public int f(int i) {
//		return 0;
//	}
//
//}