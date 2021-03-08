package lab07.opmat1.define.fraction;

public class Util {

	// Returnerer det st�rste tal, der g�r op i begge tal
	public static int greatestCommonDenominator(int firstNumber,
			int secondNumber) {
		int tempNumber;
		while (firstNumber > 0) {
			if (firstNumber < secondNumber) {
				tempNumber = firstNumber;
				firstNumber = secondNumber;
				secondNumber = tempNumber;
			}
			firstNumber = firstNumber - secondNumber;
		}
		return secondNumber;
	}
}
