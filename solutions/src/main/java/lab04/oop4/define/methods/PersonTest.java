package lab04.oop4.define.methods;

public class PersonTest {

	public static void main(final String[] args) {
		System.out.println("main-metode: start");

		Person p01 = new Person();

		Person p02 = new Person();
		p02.firstName = "Rasmus";
		p02.lastName = "Lund";
		p02.birthYear = 1973;

		// (a) Print Person state by explicitly calling toString
		System.out.println("p01's tilstand er: " + p01.toString());
		// (a) Print Person state by implicitly calling toString
		System.out.println("p02's tilstand er: " + p02);

		// (b)
		System.out.println("p02's alder i 2016 vil v�re: " + p02.getAgeAt(2016));
		System.out.println("p02's alder i 1208 vil v�re: " + p02.getAgeAt(1208));

		// (c)
		System.out.println("p02's alder i indev�rende �r er: " + p02.getCurrentAge());

		// (d)
		p01.setFullName("Hans", "Jensen");
		System.out.println("p01's tilstand er nu: " + p01);

		System.out.println("main-metode: slut");
	}
}
