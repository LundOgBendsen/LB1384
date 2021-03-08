package dk.logb.javase.c03constructors.ex01;

/**
 * Demonstrates calling a constructor when using the "new" keyword.
 * Note that the constructor has the same name as the class it 
 * constructs instances of and that it has no return type.
 * Otherwise it has the same syntax as other methods including 
 * - parentheses that may have arguments 
 * - curly braces that limit its scope.
 */

public class NewInvokesConstructor {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {

		System.out.println("Before creation of 1. person");
		Person person1 = new Person();
		System.out.println("After creation of 1. person");

		System.out.println("Before creation of 2. person");
		Person person2 = new Person();
		System.out.println("After creation of 2. person");
	}
}

class Person {
	Person() {
		System.out.println("<< No-arg constructor was called >>");
	}
}
