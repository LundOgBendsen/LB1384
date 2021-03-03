package dk.logb.javase.c04garbagecollection.ex03;

/*
 * Demontrates how to use System.gc() to request garbage collection.
 */

class RequestGc {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		System.out.println("Assigning a Person object to p1");
		Person p1 = new Person("Rasmus");
		System.out.println("Requesting garbage collection");
		System.gc();
		System.out.println("Setting p1 to null");
		p1 = null;
		System.out.println("Requesting garbage collection");
		System.gc();
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
