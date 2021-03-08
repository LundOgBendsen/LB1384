package lab03.oop3.define.classes;

// Denne klasse modellerer en person som et objekt, der har et fornavn, et
// efternavn og et f�de�r.
public class Person {

	// fornavn s�ttes som udgangspunkt til 'unknown'
	public String firstName = "Unknown";

	// efternavn s�ttes som udgangspunkt til 'unknown'
	public String lastName = "Unknown";

	// f�de�r s�ttes som udgangspunkt til -1
	public int birthYear = -1;
	
	public static int totalNumberOfPersons; 				//(c)
}
