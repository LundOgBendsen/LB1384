package c02oop3.define.classes;

public class PersonTest { // (a)

	public static void main(String[] args) { // (a)
		System.out.println("main-metode: start"); // (a)

		Person p01 = new Person(); // (a)
		Person.totalNumberOfPersons++; // (c)

		Person p02 = new Person(); // (b)
		Person.totalNumberOfPersons++; // (c)
		p02.firstName = "Rasmus"; // (b)
		p02.lastName = "Lund"; // (b)
		p02.birthYear = 1973; // (b)

		System.out.println("p01.firstName is " + p01.firstName); // (b)
		System.out.println("p01.lastName is " + p01.lastName); // (b)
		System.out.println("p01.birthYear is " + p01.birthYear); // (b)

		System.out.println("p02.firstName is " + p02.firstName); // (b)
		System.out.println("p02.lastName is " + p02.lastName); // (b)
		System.out.println("p02.birthYear is " + p02.birthYear); // (b)

		System.out.println("antal objekter " + Person.totalNumberOfPersons); // (c)

		System.out.println("main-metode: slut"); // (a)
	} // (a)
} // (a)
