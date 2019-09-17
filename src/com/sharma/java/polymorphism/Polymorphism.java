package com.sharma.java.polymorphism;

public class Polymorphism {

	static void tune(Instrument i) {
		System.out.println(i.what());
		i.play();
	}

	public static void main(String[] args) {
		tune(new Wind());
		tune(new Instrument());
	}
}

class Instrument {

	void play() {
		System.out.println("playing Instrument");
	}

	String what() {
		return "Instrument";
	}
}

class Wind extends Instrument {

	void play() {
		System.out.println("playing Wind");
	}

	String what() {
		return "Wind";
	}

}