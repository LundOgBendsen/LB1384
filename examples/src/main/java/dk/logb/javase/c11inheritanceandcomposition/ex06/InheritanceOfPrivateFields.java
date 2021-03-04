package dk.logb.javase.c11inheritanceandcomposition.ex06;

/*
 * Demonstrates that private fields are inherited but are not visible in the subclass
 */
public class InheritanceOfPrivateFields {
	public static void main(final String[] args) {

		Car car = new Car();

		/* It is NOT LEGAL to reference private super class fields directly */
//		car.maxSpeed = 200;

		/* maxSpeed is in fact inherited and we can use it via the supplied API */
		car.setMaxSpeed(200);
		System.out.println(car.getMaxSpeed());
	}
}

class Vehicle {
	/* private member - inherited but not visible */
	private int maxSpeed;

	/* public member - inherited and visible */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(final int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

class Car extends Vehicle {
	int numberOfWheels;
}
