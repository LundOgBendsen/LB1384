package c14enc1.encapsulate.fields;

public class Person {

    public String firstName = "Unknown";

    public String lastName = "Unknown";

    public int birthYear = -1;

	public static int totalNumberOfPersons;

    public String toString() {
        String result = "Person[firstName: " + firstName;
        result += ", lastName: " + lastName;
        result += ", birthYear: " + birthYear + "]";
        return result;
    }

    public int getAgeAt(int atYear) {
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

    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // (a)
    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
		Person.totalNumberOfPersons++;
    }

    // (b)
    public Person(String firstName, String lastName){
        this(firstName, lastName, getCurrentYear());
    }
	
	// (c)
	public static int getTotalNumberOfPersons(){
		return Person.totalNumberOfPersons;
	}	
}
