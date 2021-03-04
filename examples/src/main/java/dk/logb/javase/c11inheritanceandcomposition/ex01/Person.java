package dk.logb.javase.c11inheritanceandcomposition.ex01;

public class Person {
	/* Note that "final" means that birthYear cannot be changed	after initialization in the constructor */

	private final int birthYear;
	
	/* Reuse by composition. It is fitting to say that a Person has a PersonName */
	private PersonName name;

	public Person(final PersonName name, final int birthYear) {
		this.birthYear = birthYear;
		this.setName(name);
	}

	public Person(final String firstName, final String lastName, final int birthYear) {
		this(new PersonName(firstName, lastName), birthYear);
	}

	public int getBirthYear() {
		return birthYear;
	}

	public PersonName getName() {
		return name;
	}

	public void setName(final PersonName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
}
