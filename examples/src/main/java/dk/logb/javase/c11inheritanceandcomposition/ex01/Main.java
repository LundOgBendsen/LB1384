package dk.logb.javase.c11inheritanceandcomposition.ex01;

/*
 * Demonstrates a simple composition where Person is composed of PersonName and other data.
 * 
 */
public class Main {
	public static void main(final String[] args) {
		PersonName n1 = new PersonName("Rasmus", "Lund");
		Person p1 = new Person(n1, 1973);
		Person p2 = new Person(new PersonName("Jeppe", "Lund"), 2000);
		Person p3 = new Person("Kurt", "Bergstein", 1903);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
