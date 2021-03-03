package dk.logb.javase.c04garbagecollection.ex02;

/*
 * Demonstrates that the garbage collector activates when a good chunj of memory has been used.
 * 
 * Also demonstrates that objects not necessarily are garbage collected in the order they were created/dereferenced
 */

class FillMemoryToForceGc {
	public static void main(final String[] args) {
		System.out.println("Creating objects indefinetely");
		while (true) {
			System.out.println(new Person("Rasmus") + " has been created");
		}
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
