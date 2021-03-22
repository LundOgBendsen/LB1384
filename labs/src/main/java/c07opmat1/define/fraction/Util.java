package c07opmat1.define.fraction;

public class Util {

	/**
	 * @returns the largest number that both numbers are divisable by 
	 */
	public static int greatestCommonDenominator(int firstNumber, int secondNumber) {
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
