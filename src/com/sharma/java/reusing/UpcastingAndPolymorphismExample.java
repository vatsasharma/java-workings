package com.sharma.java.reusing;

public class UpcastingAndPolymorphismExample {

	public static void main(String[] args) {
		Instrument i = new Wind();// Upcasting
		i.tune(i);
		Wind wind = new Wind();
		i.tune(wind); // Polymorphism
	}

}

class Instrument {

	void play(String instrument) {
		System.out.println("Playing : " + instrument);
	}

	void tune(Instrument i) {
		i.play("Default");
	}

}

class Wind extends Instrument {

	void tune(Instrument i) {
		i.play("Wind");
	}

}
