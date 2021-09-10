package c16absin1.define.interfaces;

import java.util.ArrayList;

public abstract class Vehicle {

	private int maxNoOfPassengers;

	public Vehicle(final int maxNoOfPassengers) {
		this.maxNoOfPassengers = maxNoOfPassengers;
	}

	public int getMaxNoOfPassengers() {
		return maxNoOfPassengers;
	}

	public void setMaxNoOfPassengers(final int maxNoOfPassengers) {
		this.maxNoOfPassengers = maxNoOfPassengers;
	}

	public static ArrayList<CanCrossWater> findWaterVehicles(final ArrayList<Vehicle> vehicles) {
		ArrayList<CanCrossWater> waterVehicles = new ArrayList<CanCrossWater>();
		for (Vehicle v : vehicles) {
			if (v instanceof CanCrossWater) {
				waterVehicles.add((CanCrossWater) v);
			}
		}
		return waterVehicles;
	}

	public static CanCrossWater findFastestWaterVehicle(final ArrayList<Vehicle> vehicles) {
		ArrayList<CanCrossWater> waterVehicles = findWaterVehicles(vehicles);
		CanCrossWater fastest = waterVehicles.get(0);
		for (CanCrossWater wv : waterVehicles) {
			if (wv.getWaterSpeed() > fastest.getWaterSpeed()) {
				fastest = wv;
			}
		}
		return fastest;
	}
}
