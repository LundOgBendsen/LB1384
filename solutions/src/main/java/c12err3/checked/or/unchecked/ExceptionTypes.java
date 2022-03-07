package c12err3.checked.or.unchecked;

import java.io.File;
import java.io.IOException;

public class ExceptionTypes {

	public static void main(final String[] args) {
		/* The method getCanonicalPath might throw an IOException which is a checked
		 * exception (because it is neither a sub type of RuntimeException or
		 * Error). And the compiler forces us to handle checked exceptions.
		 */ 
		File file = new File("C:\\tmp\u0000");
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("Path not found");
		}
		System.out.flush();

		/* The method parseInt might throw a NumberFormatExceptions which is an
		 * unchecked exception so we don't need to handle it. If it does occur,
		 * the program will print an error message and terminate.
		 */
		int j = Integer.parseInt("123");
		int k = Integer.parseInt("HELLO");
		System.out.println(j + k);

	}
}
