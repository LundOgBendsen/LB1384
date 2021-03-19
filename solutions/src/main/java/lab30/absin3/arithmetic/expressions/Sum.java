package lab30.absin3.arithmetic.expressions;

public class Sum implements Expression {

	private final Expression e1, e2;

	public Sum(final Expression e1, final Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public String toString() {
		return "(" + e1 + " + " + e2 + ")";
	}

	@Override
	public double calculate() {
		return e1.calculate() + e2.calculate();
	}
}
