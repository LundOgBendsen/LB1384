package dk.logb.javase.c12exceptions.ex03;

/*
 * Demonstrates a RuntimeException - namely IndexOutOfBoundsException,
 * which is handled. Also demostrates that in this case it is malplaced
 * Since we expect an error in each program execution, this is an example
 * of the anti-pattern of flow-control-by-exception.
 */

public class AccessIllegalIndexV2 {
	public static void main(final String[] args) {
		String[] s = new String[3];
		s[0] = "Hello";
		s[1] = " my";
		s[2] = " friend!\n";
		try {
			for (int n = 0; n <= 3; n++) {
				System.out.print(s[n]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(
					"Prevented the program from crashing even though it threw an exception");
		}
	}
}
