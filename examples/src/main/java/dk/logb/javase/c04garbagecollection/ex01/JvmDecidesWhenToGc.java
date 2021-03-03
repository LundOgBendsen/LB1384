package dk.logb.javase.c04garbagecollection.ex01;

/**
 * Demonstrates that an object is not necessarily garbage collected immediately - and maybe never.
 */

class JvmDecidesWhenToGc {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		System.out.println("Assigning Person object to p1");
		Person p1 = new Person("Rasmus");
		System.out.println("null'ing p1");
		p1 = null;
		System.out.println("Waiting 3 seconds");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("Terminating");
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
