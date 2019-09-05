package com.sharma.java.reusing;

public class DelegationExample {

	public static void main(String[] args) {
		Spaceship spaceship = new Spaceship("Formula");
		spaceship.moveUp();
		spaceship.moveForward();
		spaceship.moveBackward();
		spaceship.moveDown();
	}

}

class Spaceship {

	String name;

	private SpaceshipControls controls = new SpaceshipControls();

	Spaceship(String name) {
		this.name = name;
		System.out.println("Welcome to Spaceship: " + name);
	}

	void moveUp() {
		controls.up();
	}

	void moveDown() {
		controls.down();
	}

	void moveForward() {
		controls.forward();
	}

	void moveBackward() {
		controls.backward();
	}

}

class SpaceshipControls {

	void forward() {
		System.out.println("Moving Forward");
	}

	void backward() {
		System.out.println("Moving backward");
	}

	void up() {
		System.out.println("Moving up");
	}

	void down() {
		System.out.println("Moving Down");
	}

}
