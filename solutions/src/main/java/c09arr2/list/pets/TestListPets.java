package c09arr2.list.pets;

import java.util.List;

public class TestListPets {
	public static void main(String[] args) {
		ListPets cc = new ListPets("List Pets", List.of("Aramis", "Bettemis"));
		System.out.println(cc);
		cc.addCat("Cicero");
		System.out.println(cc);
		cc.addCat("Derp");
		System.out.println(cc);
		cc.addDog("Adam", 1);
		System.out.println(cc);
		cc.addDog("Bobby", 2);
		System.out.println(cc);
		cc.addDog("Charlotte", 3);
		System.out.println(cc);
		cc.addDog("David", 4);
		System.out.println(cc);
		cc.addDog("Brenda", 2);
		System.out.println(cc);
	}
}
