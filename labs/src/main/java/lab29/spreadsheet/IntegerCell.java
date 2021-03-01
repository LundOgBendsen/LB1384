package lab29.spreadsheet;


public class IntegerCell extends Cell{
    
    private int value;

    public IntegerCell(int value) {
        this.value = value;
    }

    public double getNumberValue() {
        return value;
    }

    public String toString() {
        return "" + value;
    }
}
