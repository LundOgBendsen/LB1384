package dk.logb.javase.c11inheritanceandcomposition.ex08;

/*
 * Demonstrates that it is not possible to override a final method
 */
public class FinalMethods {
	public static void main(String[] args) {
		new SubClass().print();
	}
}

class SuperClass {
	final void print() {
		System.out.println("Super class");
	}
}

class SubClass extends SuperClass {
	/* Overriding a final method will cause a compile error */
//	final void print() {
//		System.out.println("Sub class");
//	}
}
