package c17absin2.spreadsheet;

public class IntegerCell extends Cell {

	private final int value;

	public IntegerCell(final int value) {
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
