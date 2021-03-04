package dk.logb.javase.c11inheritanceandcomposition.ex04;

/**
 * Demonstrates that subclasses inherit fields
 */
public class FieldsAreInherited {
	public static void main(final String[] args) {

		Car car = new Car();
		car.maxSpeed = 200;
		car.numberOfWheels = 4;

		Plane plane = new Plane();
		plane.maxAltitude = 20000;
	}
}

class Vehicle {
	int maxSpeed;
}

class Car extends Vehicle {
	int numberOfWheels;
}

class Plane extends Vehicle {
	int maxAltitude;
}
