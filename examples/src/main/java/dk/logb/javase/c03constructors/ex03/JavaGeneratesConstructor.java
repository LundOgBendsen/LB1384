package dk.logb.javase.c03constructors.ex03;

/**
 * Demonstrates that Java automatically generates a no-arg constructor if no
 * other constructors are defined.
 */

public class JavaGeneratesConstructor {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
	}
}

class Person {
}
