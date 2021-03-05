package dk.logb.javase.c12exceptions.ex01;

/*
 * Demonstrates the basic principles of Java exception handling
 */
public class SimpleTryCatch {
	public static void main(final String[] args) {

		try {
			/*
			 * In the "try" block, do something that might result in an exception arising. In
			 * this example we will divide by zero, causing Java to create and throw an
			 * exception object of the type AritmeticException
			 */

			int i = 23 / 0; 

			System.out.println(i);
		} catch (ArithmeticException e) {
			/* 
			 * A "try" block must be followed by one or more "catch" blocks.
			 * This catch block will catch the ArithmeticException created in the try block
			 */
			System.out.println("Caught the exception: " + e);

		}

	}
}
