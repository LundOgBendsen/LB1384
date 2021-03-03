package dk.logb.javase.c03constructors.ex02;

/**
 * Demonstrates the use of the key word "this" as a reference to the object
 * under construction.
 * The purpose is to distinguish between instance variables and local 
 * variables/parameters by using this.variableName
 */

public class ReferencingObjectUnderConstruction {
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
		firstName = "Unknown";
	}

	Person(final String firstName) {
		/* Note that the method parameter has the same name as the instance variable.
		 * This causes the parameter to shadow the instance variable. By using "this"
		 * we can avoid the shadowing. "this" refers to the new object under construction.
		 */
		this.firstName = firstName;
		/*
		 * Also note that if used in regular methods, "this" refers to the object
		 * on which the method was called. 
		 */
	}
}
