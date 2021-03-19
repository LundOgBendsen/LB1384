package lab29.absin2.spreadsheet;

public class TextCell extends Cell {

	private final String text;

	public TextCell(final String text) {
		this.text = text;
	}

	@Override
	public double getNumberValue() {
		String msg = "getNumberValue should not be called on a TextCell";
		throw new IllegalStateException(msg);
	}

	@Override
	public String toString() {
		return text;
	}
}
