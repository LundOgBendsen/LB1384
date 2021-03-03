package dk.logb.javase.c03constructors.ex09;

/**
 * Demonstrates that the key word "this" can also refer to another constructor.
 * This is often done to avoid repetitive code.
 */

public class ConstructorChaining {
	public static void main(final String[] args) {
		Person person1 = new Person("Rasmus", "Lund");
		System.out.println("1. persons first name  = " + person1.firstName);
		System.out.println("1. persons last name  = " + person1.lastName);

		Person person2 = new Person("Vicky");
		System.out.println("2. persons first name = " + person2.firstName);
		System.out.println("2. persons last name  = " + person2.lastName);

		Person person3 = new Person();
		System.out.println("3. persons first name = " + person3.firstName);
		System.out.println("3. persons last name = " + person3.lastName);
	}
}

class Person {
	String firstName;

	String lastName;

	Person(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	Person(final String firstName) {
		this(firstName, "Unknown");
	}

	Person() {
		this("Unknown", "Unknown");
	}
}
