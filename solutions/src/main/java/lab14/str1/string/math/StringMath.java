package lab14.str1.string.math;

public class StringMath {

	public static final char UNKNOWN = ' ';

	public static final char ADD = '+';

	public static final char SUBTRACT = '-';

	public static final char MULTIPLY = '*';

	public static final char DIVIDE = '/';

	public static void main(String[] args) {
		System.out.println("Type exit to exit the program");
		while (true) {
			String line = Keyboard.readLine();
			if ("exit".equalsIgnoreCase(line)) {
				break;
			}
			parseAndPrintResult(line);
		}
	}

	private static void parseAndPrintResult(String line) {
		char operator = getOperator(line);
		if (operator == UNKNOWN) {
			System.out.println("Cannot parse the expression");
		} else {
			double leftSide = getLeftSide(operator, line);
			double rightSide = getRightSide(operator, line);
			double result = calculate(operator, leftSide, rightSide);
			System.out.println("The result is " + result);
		}
	}

	private static char getOperator(String line) {
		if (line.indexOf(ADD) != -1) {
			return ADD;
		} else if (line.indexOf(SUBTRACT) != -1) {
			return SUBTRACT;
		} else if (line.indexOf(MULTIPLY) != -1) {
			return MULTIPLY;
		} else if (line.indexOf(DIVIDE) != -1) {
			return DIVIDE;
		} else {
			return UNKNOWN;
		}
	}

	private static double getLeftSide(char operator, String line) {
		int indexOfOperator = line.indexOf(operator);
		String leftSide = line.substring(0, indexOfOperator);
		leftSide = leftSide.trim();
		double result = Double.parseDouble(leftSide);
		return result;
	}

	private static double getRightSide(char operator, String line) {
		int indexOfOperator = line.indexOf(operator);
		String rightSide = line.substring(indexOfOperator + 1, line.length());
		rightSide = rightSide.trim();
		double result = Double.parseDouble(rightSide);
		return result;
	}

	private static double calculate(char operator, double leftSide,
			double rightSide) {
		switch (operator) {
		case ADD:
			return leftSide + rightSide;
		case SUBTRACT:
			return leftSide - rightSide;
		case MULTIPLY:
			return leftSide * rightSide;
		case DIVIDE:
			return leftSide / rightSide;
		default:
			return Double.NaN;
		}
	}
}
