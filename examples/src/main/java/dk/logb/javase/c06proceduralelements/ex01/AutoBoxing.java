package dk.logb.javase.c06proceduralelements.ex01;

/**
 * Autoboxing means that Java automatically converts a primitive type to its
 * wrapper type if appropriate for the code.
 * 
 * Auto-unboxing is the opposite; converting a wrapper to its primitive type.
 */
public class AutoBoxing {
	@SuppressWarnings({ "unused", "deprecation" })
	public static void main(final String[] args) {

		int int01 = 12;
		Integer integer01 = int01; // auto-boxing - in stead of explicitly creating a new Integer.

		Integer integer02 = Integer.valueOf(5);
		int int02 = integer02; // auto-unboxing - rather than integer02.intValue()

		int int03 = integer01 + integer02; // auto-unboxing
		Integer integer03 = integer01 + integer02; // auto-boxing and unboxing

		Integer[] integers = new Integer[3];
		integers[0] = 2; // auto-boxing
		integers[1] = 4; // auto-boxing
		integers[2] = 3; // auto-boxing

		integers[1]++; // auto-unboxing and boxing

		for (int current : integers) {
			current += 1;
			System.out.println(current);
		}

		Integer i1 = Integer.valueOf(1);

		Integer i2 = new Integer(1);
		int int1 = 1;
		int int2 = 1;
		System.out.println(i1 == i2);
		System.out.println(int1 == int2);
		System.out.println(i1 == int1);
	}
}
