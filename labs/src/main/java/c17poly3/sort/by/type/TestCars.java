package c17poly3.sort.by.type;

import java.util.ArrayList;
import java.util.Random;

public class TestCars {
	public static void main(final String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		Random r = new Random();
		for (int n = 0; n < 50; n++) {
			// Note how many Avensis there are
			switch (r.nextInt() % 5) {
			case 0:
				cars.add(new Car());
				break;
			case 1:
				cars.add(new Opel());
				break;
			case 2:
				cars.add(new Toyota());
				break;
			case 3:
				cars.add(new Corolla());
				break;
			default:
				cars.add(new Avensis());
				break;
			}
		}
		System.out.println("All cars:");
		System.out.println(cars);

		System.out.println();
		System.out.println("Toyotas and subtypes:");
		System.out.println(getAllToyotasAndToyotaSubtypes(cars));

		System.out.println();
		System.out.println("Toyotas and no subtypes:");
		System.out.println(getAllToyotasAndNoSubtypes(cars));
	}

	private static ArrayList<Toyota> getAllToyotasAndToyotaSubtypes(final ArrayList<Car> cars) {
		return null;
	}

	private static ArrayList<Toyota> getAllToyotasAndNoSubtypes(final ArrayList<Car> cars) {
		return null;
	}
}

class Car {
	@Override
	public String toString() {
		return "Car";
	}
}

class Opel extends Car {
	@Override
	public String toString() {
		return "Opel";
	}
}

class Toyota extends Car {
	@Override
	public String toString() {
		return "Toyota";
	}
}

class Corolla extends Toyota {
	@Override
	public String toString() {
		return "Corolla";
	}
}

class Avensis extends Toyota {
	@Override
	public String toString() {
		return "Avensis";
	}
}
