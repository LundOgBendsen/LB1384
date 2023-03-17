package dk.logb.javase.c15enumerationtypes.ex03.enumerations.are.self.documenting;

public class BooleansCanBeAmbiguous {
	public static void main(String[] args) {
		new BooleansCanBeAmbiguous().setGender(BoolGender.FEMALE);

		//Can be used in an ambiguous manner
		new BooleansCanBeAmbiguous().setGender(false);
	}

	void setGender(boolean gender) {
	}

}

class BoolGender {
	static final boolean MALE = false;
	static final boolean FEMALE = true;
	// What about extensions?
}