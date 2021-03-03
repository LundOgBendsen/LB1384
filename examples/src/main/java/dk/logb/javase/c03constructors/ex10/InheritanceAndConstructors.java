package dk.logb.javase.c03constructors.ex10;

/**
 * Demonstates how to call a constructor in the super class of the class
 * constructing a new object by using the key word "super".
 * 
 * Super must be called in the first line of a constructor - if no such call is
 * present, the compiler will attempt to call the no-arg constructor, "super()",
 * which will fail if no such constructor is present.
 */

public class InheritanceAndConstructors {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		PersonWithFirstName onlyFirst = new PersonWithFirstName("Rasmus");
		PersonWithFullName fullName = new PersonWithFullName("Rasmus", "Lund");
	}
}

class PersonWithFirstName {
	String firstName;

	PersonWithFirstName(final String firstName) {
		this.firstName = firstName;
	}
}

class PersonWithFullName extends PersonWithFirstName {
	String lastName;

	PersonWithFullName(final String firstName, final String lastName) {
		/*
		 * Calling the super class constructor with a String argument. try commenting
		 * out the next line and examine the compile error
		 */
		super(firstName);
		this.lastName = lastName;
	}
}
