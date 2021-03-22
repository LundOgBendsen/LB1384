package c12err2.exception.catching;

public class SimpleCatching {

	public static void main(final String[] args) {
		String message = null;
		printInUpperCase(message);
	}

	public static void printInUpperCase(final String stringToPrint) {
		String stringInUpperCase = convertToUpperCase(stringToPrint);
		System.out.println(stringInUpperCase);
	}

	public static String convertToUpperCase(final String stringIn) {
		/*
		 * It is important that stringOut is declared outside the try block since is
		 * would only be visible inside if that is where it was declared
		 */
		String stringOut;
		try {
			stringOut = stringIn.toUpperCase();
		} catch (NullPointerException e) {
			stringOut = null;
		}
		return stringOut;
	}

	/*
	 * This code would be nicer :
	 */
//	public static String convertToUpperCase(String stringIn) {
//		String stringOut;
//		if (stringIn != null) {
//			stringOut = stringIn.toUpperCase();
//		} else {
//			stringOut = null;
//		}
//		return stringOut;
//	}

}

