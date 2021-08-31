/*
 * Solution - while loops
 */
package c08loop1.use.loops;

public class StarPrinterUsingWhile {

	public static void main(String[] args) {

		int height = askUserForTriangleHeight();
		printTriangleOfStars(height);
	}

	private static int askUserForTriangleHeight() {
		System.out.println("How high should the triangle be?");
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
