package dk.logb.javase.c11inheritanceandcomposition.ex07;

/*
 * Demonstrates overriding of methods and adding methods
 */
public class OverridingMethods {
	public static void main(final String[] args) {
		SubClass mc = new SubClass();
		mc.printA(); // inherited
		mc.printB(); // overridden
		mc.printC(); // overridden
		mc.printD(); // added
	}
}

class SuperClass {
	void printA() {
		System.out.println("Super class printA");
	}

	void printB() {
		System.out.println("Super class printB");
	}

	void printC() {
		System.out.println("Super class printC");
	}
}

class SubClass extends SuperClass {
	@Override
	void printB() {
		System.out.println("Sub class printB");
	}

	@Override
	void printC() {
		/* First we call the super class' printC */ 
		super.printC();
		/* Then we add some more */
		System.out.println("Sub class printC");
	}
	
	public void printD() {
		System.out.println("Sub class printD");
	}


}
