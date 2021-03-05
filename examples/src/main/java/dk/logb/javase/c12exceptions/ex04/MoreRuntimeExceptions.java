package dk.logb.javase.c12exceptions.ex04;

/*
 * Demonstrates three RuntimeExceptions:
 * NullPointerException, ArithmeticException and ClassCastException
 */

public class MoreRuntimeExceptions {
	// automatically initialized to null
	static String s;

	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		try {
			System.out.println("Attempting s.trim() where s == null");
			s.trim();
		} catch (NullPointerException e) {
			System.out.println("\n\tCaught exception: " + e);
		}

		try {
			System.out.println("\n\n\nAttempting 12 / 0");
			int n = 12 / 0;
		} catch (ArithmeticException e) {
			System.out.println("\n\tCaught exception: " + e);
		}

		try {
			System.out.println("\n\n\nAttempting: ");
			System.out.println("Role r = new Role();");
			System.out.println("StudentRole sr = (StudentRole)r;");
			Role r = new Role();
			StudentRole sr = (StudentRole) r;
		} catch (ClassCastException e) {
			System.out.println("\n\tCaught exception: " + e);
			e.printStackTrace();
		}
	}
}

class Role {
}

class StudentRole extends Role {
}
