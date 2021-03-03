package dk.logb.javase.c03constructors.ex04;

/**
 * Demonstrates that the generated no-args constructor will not accept arguments.
 */

public class SignatureOfGeneratedConstructor {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		Person person1 = new Person();
		/* the following line will not compile */
//		Person person2 = new Person("Rasmus");
	}
}

class Person {
}
