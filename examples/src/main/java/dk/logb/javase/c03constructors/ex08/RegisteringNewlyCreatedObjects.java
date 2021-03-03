package dk.logb.javase.c03constructors.ex08;

/**
 * Demonstrates use of "this" as a reference to the object under construction - in this case in order to add the new object to a list.
 * 
 * Note that it is not possible to create a Person object without it being added to the list.
 */
import java.util.ArrayList;

public class RegisteringNewlyCreatedObjects {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		Person person1 = new Person("Vicky");
		Person person2 = new Person("Rasmus");
		Person person3 = new Person("Jeppe");
		System.out.println("Content of the list after creating 3 objects:");
		for (int i = 0; i < Person.allPersonObjects.size(); i++) {
			System.out.println(Person.allPersonObjects.get(i));
		}
		/* the reference is saved in the list even if you don't keep it in a reference variable */
		new Person("Bodil");
		new Person("Kjeld");

		System.out.println("Content of the list after creating 2 more objects:");
		for (int i = 0; i < Person.allPersonObjects.size(); i++) {
			System.out.println(Person.allPersonObjects.get(i));
		}
	}
}

class Person {
	static ArrayList<Person> allPersonObjects = new ArrayList<>();

	String firstName;

	Person(final String firstName) {
		this.firstName = firstName;
		allPersonObjects.add(this);
	}

	@Override
	public String toString() {
		return "Person[firstName=" + firstName + "]";
	}
}
