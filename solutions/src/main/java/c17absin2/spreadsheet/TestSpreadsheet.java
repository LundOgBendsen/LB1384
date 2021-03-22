package c17absin2.spreadsheet;

public class TestSpreadsheet {

	public static void main(final String[] args) {
		System.out.println("==<< Creating empty spreadsheet >>==");
		Spreadsheet s = new Spreadsheet(5, 6);
		System.out.println(s);

		System.out.println();
		System.out.println("==<< Inserting text cells >>==");
		s.setCell(1, 1, new TextCell("Bananas"));
		s.setCell(1, 2, new TextCell("Oranges"));
		s.setCell(1, 4, new TextCell("Total"));
		s.setCell(2, 2, new TextCell("+ "));
		s.setCell(2, 4, new TextCell("= "));
		System.out.println(s);

		System.out.println();
		System.out.println("==<< Inserting integer cell >>==");
		s.setCell(3, 1, new IntegerCell(12));
		System.out.println(s);

		System.out.println();
		System.out.println("==<< Inserting floating point cell >>==");
		s.setCell(3, 2, new FloatingPointCell(4.5));
		System.out.println(s);

		System.out.println();
		System.out.println("==<< Inserting sum cell >>==");
		s.setCell(3, 4, new SumCell(s.getCell(3, 1), s.getCell(3, 2)));
		System.out.println(s);
	}
}
