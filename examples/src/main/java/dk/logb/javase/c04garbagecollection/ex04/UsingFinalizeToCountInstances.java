package dk.logb.javase.c04garbagecollection.ex04;

/*
 * Demonstrates how the finalize method can be used to count the number of currently allocated Person objects in memory.
 * 
 * This concept is convenient for testing complicated programs,
 * 
 * Note that the Person class differs from the other examples
 */

class UsingFinalizeToCountInstances {
	public static void main(final String[] args) {
		Person p;
		while (true) {
			p = new Person("Rasmus");
			System.out.println(p + " has been created");
		}
	}
}

class Person {
	int id;

	String name;

	static int nextId = 0;

	// NEW
	static int numberInMemory = 0;

	Person(final String name) {
		this.id = ++nextId;
		this.name = name;
		// NEW
		numberInMemory++;
		System.out.println("Constructor: currently "+ Person.numberInMemory + " Person-objects in memory");
	}

	@Override
	public String toString() {
		return "Person[ id=" + id + ", name= " + name + "]";
	}

	@Override
	public void finalize() {
		System.out.println(this + " has been gc'ed");
		// NEW
		numberInMemory--;
		System.out.println("Finalize: currently "+ Person.numberInMemory + " Person-objects in memory");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}
