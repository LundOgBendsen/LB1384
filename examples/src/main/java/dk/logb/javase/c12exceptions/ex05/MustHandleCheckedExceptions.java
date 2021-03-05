package dk.logb.javase.c12exceptions.ex05;

/*
 * Demonstrates that checked exceptions must be handled (unlike Errors and RuntimeExceptions)
 * Object.clone(), throws CloneNotSupportedException as documented in its API documentation
 */

public class MustHandleCheckedExceptions {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		Person p1 = new Person();

		/* The next line will not compile */
//		Person p2 = (Person) p1.clone();

		try {
			Person p3 = (Person) p1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("This should never happen" + e);
		}

	}
}

class Person implements Cloneable {
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
