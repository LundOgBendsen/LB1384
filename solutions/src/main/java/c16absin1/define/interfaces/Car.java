package c16absin1.define.interfaces;

public class Car extends Vehicle implements CanCrossLand {

	private final int landSpeed;

	public Car(final int maxNoOfPassengers, final int landSpeed) {
		super(maxNoOfPassengers);
		this.landSpeed = landSpeed;
	}

	@Override
	public String toString() {
		String result = "Car[";
		result += "paxNoOfPassengers=" + getMaxNoOfPassengers();
		result += ", landSpeed=" + landSpeed;
		result += "]";
		return result;
	}

	@Override
	public int getLandSpeed() {
		return this.landSpeed;
	}
}
