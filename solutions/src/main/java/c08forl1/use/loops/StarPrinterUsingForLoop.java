/*
 * L�sning p� �velse 10 - Indlejrede l�kker (1)
 */
package c08forl1.use.loops;

public class StarPrinterUsingForLoop {

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
		for (int i = height; i > 0; i--) {
			printLineOfStars(i);
			System.out.println();
		}
	}

	private static void printLineOfStars(int length) {
		for (int j = 0; j < length; j++) {
			System.out.print("*");
		}
	}
}
