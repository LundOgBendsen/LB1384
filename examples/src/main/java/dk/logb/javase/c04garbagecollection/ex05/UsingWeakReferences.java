package dk.logb.javase.c04garbagecollection.ex05;

/**
 * Demonstrates the use of weak references that can be used to reference object without preventing them from being garbage collected.
 */
import java.lang.ref.WeakReference;

class UsingWeakReferences {
	public static void main(final String[] args) {
		System.out.println("Assigning a Person object to p1");
		Person p1 = new Person("Rasmus");

		System.out.println("Creating a weak reference to the object");
		WeakReference<Person> weakP1 = new WeakReference<Person>(p1);

		System.out.println("Printing the object referenced by the weak reference");

		/* WeakReference.get() returns the object. If it has been garbage collected, null is returned */
		System.out.println(weakP1.get());

		System.out.println("Setting p1 to null");
		p1 = null;

		System.out.println("Printing the object from the WeakReference");
		System.out.println("\t(hopefully it has not been garbage collected yet)");
		System.out.println(weakP1.get());

		System.out.println("Request garbage collection");
		System.gc();

		System.out.println("Printing the object again");
		System.out.println("\t(should be null if the object was garbage collected.");
		System.out.println(weakP1.get());
		
		System.out.println("Did you notice something strange about the order?");
	}
}

class Person {
	int id;

	String name;

	static int nextId = 0;

	Person(final String name) {
		this.id = ++nextId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person[ id=" + id + ", name= " + name + "]";
	}

	@Override
	public void finalize() {
		System.out.println(this + " has been gc'ed");
	}
}
