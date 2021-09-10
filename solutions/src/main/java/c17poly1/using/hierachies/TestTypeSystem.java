package c17poly1.using.hierachies;

public class TestTypeSystem {

	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		/* (a) An object reference can poi to all types of objects */
		Object[] objects = new Object[6];
		objects[0] = new Animal();
		objects[1] = new Reptile();
		objects[2] = new Mammal();
		objects[3] = new Snake();
		objects[4] = new Cat();
		objects[5] = new Dog();

		/* (b) A reference can point to objects of its own type */
		Animal a01 = new Animal();
		Reptile a02 = new Reptile();
		Dog a03 = new Dog();

		/* (c) A reference can point o instances of its subtypes */
		Animal a04 = new Reptile();
		Animal a05 = new Dog();
		Mammal a06 = new Cat();

		/* (d) A reference cannot point to an object that is neither the same type or 
		 * a sub type of the reference type 
		 */

		// Dog a07 = new Animal();
		// Snake a08 = new Dog();
		// Cat a08 = new Dog();
		// Mammal a09 = new Object();

		/* (e) Methods are inherited */
		Mammal a10 = new Dog();
		a10.run(); // udskriver: Mammal is running

		/* (f) It is the objects type and not the reference type that determines which method is called
		 * - overriding, polymorphism and dynamic binding
		 */
		Mammal a11 = new Cat();
		a11.run(); // udskriver: Cat is running (og ikke Mammal is running)

		/* (g) It is not possible to calll a method on a reference that does not know the method */
		Animal a12 = new Dog();
		// a12.bark(); //Animal does not know the bark() method
		Object a13 = new Cat();
		// a13.run(); //Object does not know the run() method

		/* (h) Example of unnecessary eksplicit upcast */
		Animal a14 = new Dog();
		Object a15 = new Snake();
		Dog a16 = new Dog();
		Animal a17 = a16;
		Object a18 = a17;

		/* (i) Examples of implicit upcast */
		Animal a19 = new Dog(); // The Dog instance is upcast to Animal
		Object a20 = new Snake(); // The Snake instance is upcast to Object
		Dog a21 = new Dog();
		Animal a22 = a21; // The Dog instance is upcast from Dog to Animal
		Object a23 = a22; // The Dog instance is upcast from Animal to Object

		/* (j) Eksempel of explicit downcast */
		Animal a24 = new Snake(); // Snake object upcast to Animal
		Reptile a25 = (Reptile) a24; // Snake object downcast from Animal to Reptile
		Snake a26 = (Snake) a25; // Snake object downcast from Reptile to Snake

		/* (k) An example showing that downcasts must be explicit */
		Animal a27 = new Snake(); // Snake object upcast to Animal
		// Snake a28 = a27; //Downcast must be explicit

		/* (l) An example of an erroneous downcast
		* (Should result in a ClassCastException)
		*/
		Mammal a28 = new Cat();
		try {
			Dog a29 = (Dog) a28; // throws ClassCastException runtime
		} catch (ClassCastException e) {
			System.out.println("Greb en forventet ClassCastException");
		}
	}
}
