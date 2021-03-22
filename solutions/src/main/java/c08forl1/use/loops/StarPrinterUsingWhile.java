/*
 * L�sning p� �velse 10 - Indlejrede l�kker (1)
 */
package c08forl1.use.loops;

public class StarPrinterUsingWhile {

	public static void main(String[] args) {

		int height = askUserForTriangleHeight();
		printTriangleOfStars(height);
	}

	private static int askUserForTriangleHeight() {
		System.out.println("Hvor h�j skal stjernen v�re?");
		String input = Keyboard.readLine();
		int height = Integer.parseInt(input);
		return height;
	}

	private static void printTriangleOfStars(int height) {
		int j = 1;
		while (j <= height) {
			String line;
			line = printCharRepeatedly(' ', height - j);
			line += printCharRepeatedly('*', j);
			System.out.println(line);
			j++;
		}
	}

	private static String printCharRepeatedly(char c, int count) {
		String result = "";
		int i = 0;
		while (i < count) {
			result += c;
			i++;
		}
		return result;
	}
}
