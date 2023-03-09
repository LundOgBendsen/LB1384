package c09arr2.list.pets;

public class TestListPets {
	public static void main(String[] args) {
		ListPets cc = new ListPets("List Pets");
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
