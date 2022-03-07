package c13pack1.handle.packages;

import java.time.LocalDate;

public class Person {

	public String firstName = "Unknown";

	public String lastName = "Unknown";

	public int birthYear = -1;

	public static int totalNumberOfPersons;

	@Override
	public String toString() {
		String result = "Person[firstName: " + firstName;
		result += ", lastName: " + lastName;
		result += ", birthYear: " + birthYear + "]";
		return result;
	}

	public int getAgeAt(final int atYear) {
		int result = atYear - birthYear;
		if (result < 0) {
			result = 0;
		}
		return result;
	}

	public int getCurrentAge() {
		int currentYear = getCurrentYear();
		return getAgeAt(currentYear);
	}

	private static int getCurrentYear() {
		return LocalDate.now().getYear();
	}

	public void setFullName(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// (a)
	public Person(final String firstName, final String lastName, final int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		Person.totalNumberOfPersons++;
	}

	// (b)
	public Person(final String firstName, final String lastName) {
		this(firstName, lastName, getCurrentYear());
	}

	// (c)
	public static int getTotalNumberOfPersons() {
		return Person.totalNumberOfPersons;
	}
}
