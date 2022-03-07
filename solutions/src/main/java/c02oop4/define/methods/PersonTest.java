package c02oop4.define.methods;

public class PersonTest {

	public static void main(final String[] args) {
		System.out.println("main-method: start");

		Person p01 = new Person();

		Person p02 = new Person();
		p02.firstName = "Rasmus";
		p02.lastName = "Lund";
		p02.birthYear = 1973;

		// (a) Print Person state by explicitly calling toString
		System.out.println("p01's state is: " + p01.toString());
		// (a) Print Person state by implicitly calling toString
		System.out.println("p02's state is: " + p02);

		// (b)
		System.out.println("p02's age in 2022 is: " + p02.getAgeAt(2022));
		System.out.println("p02's age in 1208 was: " + p02.getAgeAt(1208));

		// (c)
		System.out.println("p02's current are is: " + p02.getCurrentAge());

		// (d)
		p01.setFullName("Hans", "Jensen");
		System.out.println("p01's state is now: " + p01);

		System.out.println("main-method: end");
	}
}
