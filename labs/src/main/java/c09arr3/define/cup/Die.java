package c09arr3.define.cup;

import java.util.Random;

public class Die {

	static Random random = new Random();

	private final int numSides;

	public Die(final int numberOfSides) {
		this.numSides = numberOfSides;
	}

	@Override
	public String toString() {
		return "Die[sides=" + this.numSides + "]";
	}

	public double getExpectedAverage() {
		return (((double) this.numSides - 1) / 2) + 1;
	}

	public int roll() {
		return Die.random.nextInt(numSides) + 1;
	}
}
