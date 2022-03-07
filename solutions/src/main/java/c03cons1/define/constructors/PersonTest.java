package c03cons1.define.constructors;

public class PersonTest {

	public static void main(final String[] args) {
		System.out.println("main method: start");

		Person p01 = new Person("Rasmus", "Lund", 1973);
		System.out.println(p01);

		Person p02 = new Person("Hans", "Jensen");
		System.out.println(p02);

		System.out.println("number of persons " + Person.getTotalNumberOfPersons());

		System.out.println("main-method: end");
	}
}
