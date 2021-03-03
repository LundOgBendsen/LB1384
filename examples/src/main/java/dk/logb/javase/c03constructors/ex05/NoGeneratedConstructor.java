package dk.logb.javase.c03constructors.ex05;

/**
 * Demonstrates that if we define a constructor our selves, Java will not create
 * the no-args constructor.
 */

public class NoGeneratedConstructor {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		Person person1 = new Person("Rasmus");

		/*
		 * The following line will not compile because no no-args constuctor was
		 * generated
		 */
//		Person person2 = new Person();
		
	}
}

class Person {
	String firstName;

	Person(final String firstName) {
		this.firstName = firstName;
	}
}
