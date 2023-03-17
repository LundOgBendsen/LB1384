package dk.logb.javase.c15enumerationtypes.ex03.enumerations.are.self.documenting;

/**
 * Demonstrates that enums are much more self-documenting than booleans
 */
public class EnumsAreSelfDocumenting {
	public static void main(String[] args) {		
		/* Enum ensures readability */
		new EnumsAreSelfDocumenting().setGender(Gender.MALE);
	}
	
	public void setGender(Gender gender) {
		
	}
}


enum Gender  {
	MALE, FEMALE, OTHER;
}