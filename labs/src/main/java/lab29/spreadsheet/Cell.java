package lab29.spreadsheet;

public abstract class Cell {
    
    @SuppressWarnings("unused")
	private Spreadsheet spreadsheet;
    
    public abstract double getNumberValue();
}
