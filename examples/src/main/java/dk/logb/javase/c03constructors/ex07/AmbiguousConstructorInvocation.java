package dk.logb.javase.c03constructors.ex07;

/**
 * Demonstrates that the Java compiler must be able to un-ambiguously determine
 * which constructor to use.
 * 
 * This is true for other regular methods as well.
 */

public class AmbiguousConstructorInvocation {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		/* Uses constructor 1 */
		AmbiguousClass ac1 = new AmbiguousClass(12, 3.3);

		/* Uses constructor 2 */
		AmbiguousClass ac2 = new AmbiguousClass(12.4, 3);

		/* Ambiguous call - parameters could fit either constructor */
//		AmbiguousClass ac3 = new AmbiguousClass(4, 3);
	}
}

class AmbiguousClass {
	// Constructor 1
	AmbiguousClass(final int i, final double d) {
		System.out.println("first int(" + i + "), then double (" + d + ")");
	}

	// Constructor 2
	AmbiguousClass(final double d, final int i) {
		System.out.println("first double(" + d + "), then int(" + i + ")");
	}
}
