package c09arr2.list.pets;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A pet sanctuary uses ArrayList
 */
public class ListPets {
	private static final int NUM_CAGES = 4;
	private String name;
	private ArrayList<String> cats = new ArrayList<String>();;
	private ArrayList<String> dogs = new ArrayList<String>();
	
	public ListPets(String name) {
		this.name = name;
		for (int i = 0; i < NUM_CAGES; i++) {
			dogs.add("None");
		}
	}

	public void addCat(String cat) {
		cats.add(cat);
		Collections.sort(cats);
	}

	public void addDog(String member, int position) {
		dogs.set(position - 1, member);
	}

	@Override
	public String toString() {
		return "ListPets [name=" + name + ", cats=" + cats + ", dogs=" + dogs + "]";
	}
}
