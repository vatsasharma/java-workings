package com.sharma.java.innerclasses;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		MyParcel parcel = new MyParcel();
		parcel.destination("Africa").whereTo();
	}

}

class MyParcel {

	private int id;

	Destination destination(String whereTo) {
		return new Destination() {
			@Override
			public void whereTo() {
				System.out.println(id + " - " + whereTo);
			}
		};

	}

}