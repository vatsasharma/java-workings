package com.sharma.java.innerclasses;

public class NestedClass {

	public static void main(String[] args) {
		new Parcel3.PDestination("Africa").whereTo();
	}

}

class Parcel3 {

	static class PDestination implements Destination {

		private String whereTo;

		public PDestination(String whereTo) {
			this.whereTo = whereTo;
		}

		@Override
		public void whereTo() {
			System.out.println("Destination : " + whereTo);
		}

	}

}