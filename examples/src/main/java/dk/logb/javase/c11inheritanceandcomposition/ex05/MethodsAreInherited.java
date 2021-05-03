package dk.logb.javase.c11inheritanceandcomposition.ex05;

/**
 * Demonstrates that subclasses inherit methods and can hide fields
 */
public class MethodsAreInherited {
	public static void main(final String[] args) {

		Car car = new Car();
		car.maxSpeed = 200;
		car.numberOfWheels = 4;
		car.speed = 100;
		
		System.out.println(car.isUnderMaxSpeed(140));
		/* Might produce unexpected result. Why? */
		System.out.println(car.getSpeed());
	}
}

class Vehicle {
	int maxSpeed;
	int speed;

	boolean isUnderMaxSpeed(final int speed) {
		if (speed < maxSpeed) {
			return true;
		} else {
			return false;
		}
	}
	
	int getSpeed() {
		return speed;
	}
}

class Car extends Vehicle {
	int numberOfWheels;
	/* Hides the speed variable in Vehicle */
	int speed;
}
