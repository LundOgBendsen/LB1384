package lab28.absin1.define.interfaces;

public class Ship extends Vehicle implements CanCrossWater {

	private final int waterSpeed;

	public Ship(final int maxNoOfPassengers, final int waterSpeed) {
		super(maxNoOfPassengers);
		this.waterSpeed = waterSpeed;
	}

	@Override
	public String toString() {
		String result = "Ship[";
		result += "paxNoOfPassengers=" + getMaxNoOfPassengers();
		result += ", waterSpeed=" + waterSpeed;
		result += "]";
		return result;
	}

	@Override
	public int getWaterSpeed() {
		return this.waterSpeed;
	}
}
