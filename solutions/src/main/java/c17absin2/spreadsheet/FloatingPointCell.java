package c17absin2.spreadsheet;

public class FloatingPointCell extends Cell {

	private final double value;

	public FloatingPointCell(final double value) {
		this.value = value;
	}

	@Override
	public double getNumberValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
