package dk.logb.javase.c03constructors.ex06;

/**
 * Demonstrates that constructors can be overloaded.
 */

public class OverloadingConstructors {
	public static void main(final String[] args) {

		Person person1 = new Person();
		System.out.println("1. persons first name = " + person1.firstName);

		Person person2 = new Person("Rasmus");
		System.out.println("2. persons first name = " + person2.firstName);
	}
}

class Person {
	String firstName;

	Person() {
		firstName = "unknown";
	}

	Person(final String fn) {
		firstName = fn;
	}
}
