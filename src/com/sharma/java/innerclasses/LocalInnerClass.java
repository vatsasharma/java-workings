package com.sharma.java.innerclasses;

public class LocalInnerClass {

	public static void main(String[] args) {
		Parcel parcel = new Parcel();
		Destination parcelDestination = parcel.destination("Africa");
		parcelDestination.whereTo();
	}

}

interface Destination {

	void whereTo();

}

class Parcel {

	Destination destination(String s) {

		class ParcelDestination implements Destination {

			private String destination;

			public ParcelDestination(String whereTo) {
				destination = whereTo;
			}

			public void whereTo() {
				System.out.println(destination);
			}

		}
		return new ParcelDestination(s);
	}

}