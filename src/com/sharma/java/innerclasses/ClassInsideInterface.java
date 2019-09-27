package com.sharma.java.innerclasses;

public class ClassInsideInterface {

	public static void main(String[] args) {
		new IParcel.Sample().print();
	}
}

interface IParcel {

	void print();

	class Sample implements IParcel {

		public void print() {
			System.out.println("Common code");
		}

	}

}