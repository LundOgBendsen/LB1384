/*
 * Solution - for loops
 */
package c08loop1.use.loops;

public class StarPrinterUsingForLoop {

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
