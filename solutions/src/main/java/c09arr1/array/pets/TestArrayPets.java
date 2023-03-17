package c09arr1.array.pets;

public class TestArrayPets {
	public static void main(String[] args) {
		String[] cats = {"Aramis","Bettemis"};
		ArrayPets cc = new ArrayPets("Array Pets", cats);
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
