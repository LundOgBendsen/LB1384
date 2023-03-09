package c09arr1.array.pets;

import java.util.Arrays;


/**
 * A pet sanctuary that uses arrays
 */
public class ArrayPets {
	private static final int NUM_CAGES = 4;
	private String name;
	private String[] cats = new String[0];
	private String[] dogs = new String[NUM_CAGES];
	
	public ArrayPets(String name) {
		this.name = name;
	}

	public void addCat(String cat) {
		String[] old = cats;
		cats = new String[old.length+1];
		System.arraycopy(old, 0, cats, 0, old.length);
		cats[cats.length-1] = cat;
		Arrays.sort(cats);
	}
		
	public void addDog(String dog, int position) {
		dogs[position - 1] = dog;
	}

	@Override
	public String toString() {
		return "ArrayPets [name=" + name + ", cats=" + Arrays.toString(cats) + ", dogs=" + Arrays.toString(dogs) + "]";
	}

}
