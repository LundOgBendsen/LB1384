package lab28.absin1.define.interfaces;

import java.util.ArrayList;

public class TestVehicles {

	public static void main(final String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.add(new Car(5, 160));
		vehicles.add(new Car(2, 280));
		vehicles.add(new Ship(8, 40));
		vehicles.add(new Ship(1000, 20));
		vehicles.add(new Plane(150, 950));
		vehicles.add(new Plane(3, 300));
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}

		System.out.println();
		System.out.println("==<< Finding all water vehicles >>==");
		ArrayList<CanCrossWater> waterVehicles = Vehicle.findWaterVehicles(vehicles);
		for (CanCrossWater wv : waterVehicles) {
			System.out.println(wv);
		}

		System.out.println();
		System.out.println("==<< Finding fastest water vehicles >>==");
		CanCrossWater fastestWaterVehicle;
		fastestWaterVehicle = Vehicle.findFastestWaterVehicle(vehicles);
		System.out.println(fastestWaterVehicle);
	}
}
