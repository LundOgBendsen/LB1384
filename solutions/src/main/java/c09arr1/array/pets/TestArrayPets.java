package c09arr1.array.pets;

public class TestArrayPets {
	public static void main(String[] args) {
		ArrayPets cc = new ArrayPets("Array Pets");
		System.out.println(cc);
		cc.addCat("Amalie");
		System.out.println(cc);
		cc.addCat("Bert");
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
