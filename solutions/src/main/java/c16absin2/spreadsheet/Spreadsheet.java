package c16absin2.spreadsheet;

public class Spreadsheet {

	private final Cell[][] cells;

	private int cellWidth = 10;

	public Spreadsheet(final int width, final int height) {
		cells = new Cell[width][height];

		// Fill with EmptyCells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				setCell(x, y, EmptyCell.getEmptyCell());
			}
		}
	}

	public int getWidth() {
		return cells.length;
	}

	public int getHeight() {
		return cells[0].length;
	}

	public void setCell(final int x, final int y, final Cell newCell) {
		cells[x][y] = newCell;
	}

	public Cell getCell(final int x, final int y) {
		return cells[x][y];
	}

	@Override
	public String toString() {
		String result = createLine();

		// Run through all rows
		for (int y = 0; y < getHeight(); y++) {
			result += "\n" + "|";

			// Run through all columns in each row
			for (int x = 0; x < getWidth(); x++) {
				String s = cells[x][y].toString();
				s = StringHelper.setStringLength(s, cellWidth);
				result += s + "|";
			}
			result += createLine();
		}
		return result;
	}

	private String createLine() {
		String result = "\n+";
		for (int x = 0; x < getWidth(); x++) {
			result += StringHelper.createLine(cellWidth);
			result += "+";
		}
		return result;
	}

	public int getCellWidth() {
		return cellWidth;
	}

	public void setCellWidth(final int cellWidth) {
		this.cellWidth = cellWidth;
	}
}
