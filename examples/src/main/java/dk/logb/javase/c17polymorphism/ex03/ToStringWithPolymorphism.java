package dk.logb.javase.c17polymorphism.ex03;

import java.util.ArrayList;

public class ToStringWithPolymorphism {
	public static void main(final String[] args) {
		ArrayList<Vehicle> a = new ArrayList<>();
		a.add(new Car(200));
		a.add(new Truck(120));
		a.add(new Ship(3, 30));

		System.out.println("ArrayList knows how to print it self: ");
		System.out.println(a);

		System.out.println("\nOr manually: ");
		for (Vehicle vehicle : a) {
			System.out.println(vehicle);
		} 
	}
}

abstract class Vehicle {
	int speed;

	Vehicle(final int speed) {
		this.speed = speed;
	}
}

class Car extends Vehicle {
	int numberOfWheels = 4;

	Car(final int speed) {
		super(speed);
	}

	@Override
	public String toString() {
		return "Car[speed=" + speed + ", numberOfWheels=" + numberOfWheels + "]";
	}
}

class Truck extends Car {
	Truck(final int speed) {
		super(speed);
		numberOfWheels = 12;
	}

	@Override
	public String toString() {
		return "Truck[speed=" + speed + ", numberOfWheels=" + numberOfWheels + "]";
	}
}

class Ship extends Vehicle {
	int numberOfSails;

	Ship(final int numberOfSails, final int speed) {
		super(speed);
		this.numberOfSails = numberOfSails;
	}

	@Override
	public String toString() {
		return "Ship[speed=" + speed + ", numberOfSails=" + numberOfSails + "]";
	}
}
