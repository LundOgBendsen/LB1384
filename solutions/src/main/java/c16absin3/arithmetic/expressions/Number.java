package c16absin3.arithmetic.expressions;

public class Number implements Expression {

	private final double number;

	public Number(final double number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "" + number;
	}

	@Override
	public double calculate() {
		return number;
	}
}
