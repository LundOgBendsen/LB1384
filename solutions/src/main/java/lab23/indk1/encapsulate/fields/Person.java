package lab23.indk1.encapsulate.fields;

public class Person {

	/* Make sure that the following fields cannot be changed from outside this class */
	private static int totalNumberOfPersons;
	private String firstName = "Unknown";
	private String lastName = "Unknown";
	private int birthYear = -1;

	/* Validate first and last name by using validating setters */
	public void setFullName(final String firstName, final String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public Person(final String firstName, final String lastName, final int birthYear) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthYear(birthYear);
	}

	public Person(final String firstName, final String lastName) {
		this(firstName, lastName, getCurrentYear());
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(final int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	/* Validate firstName */
	public void setFirstName(final String firstName) {
		if (firstName == null) {
			String msg = "Parameter firstName must not be null";
			throw new NullPointerException(msg);
		}
		if (firstName.equals("")) {
			String msg = "Parameter firstName must not be null";
			throw new IllegalArgumentException(msg);
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	/* Validate lastName */
	public void setLastName(final String lastName) {
		if (lastName == null) {
			String msg = "Parameter lastName must not be null";
			throw new NullPointerException(msg);
		}
		if (lastName.equals("")) {
			String msg = "Parameter lastName must not be null";
			throw new IllegalArgumentException(msg);
		}
		this.lastName = lastName;
	}

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
		java.util.Calendar c = java.util.Calendar.getInstance();
		int currentYear = c.get(java.util.Calendar.YEAR);
		return currentYear;
	}

	public static int getTotalNumberOfPersons() {
		return Person.totalNumberOfPersons;
	}

}
