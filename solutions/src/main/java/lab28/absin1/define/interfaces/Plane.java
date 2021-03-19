package lab28.absin1.define.interfaces;

public class Plane extends Vehicle implements CanCrossLand, CanCrossWater {

	private final int airSpeed;

	public Plane(final int maxNoOfPassengers, final int airSpeed) {
		super(maxNoOfPassengers);
		this.airSpeed = airSpeed;
	}

	@Override
	public String toString() {
		String result = "Plane[";
		result += "paxNoOfPassengers=" + getMaxNoOfPassengers();
		result += ", airSpeed=" + airSpeed;
		result += "]";
		return result;
	}

	@Override
	public int getLandSpeed() {
		return airSpeed;
	}

	@Override
	public int getWaterSpeed() {
		return airSpeed;
	}
}
