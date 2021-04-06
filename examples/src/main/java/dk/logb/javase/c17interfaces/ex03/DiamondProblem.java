package dk.logb.javase.c17interfaces.ex03;
 /**
  * Demonstrates the default key word in interfaces and how it can lead to a conflict - the so called diamond problem
  *
  */
public class DiamondProblem implements I1, I2 {
	/* The following override is necessary for the program to compile since both i1 and i2 have default implementations */
	@Override
	public void a() {
		I1.super.a();
	}

}

interface DiamondInterface extends I1, I2 {
	/* same problem */
	@Override
	default void a() {
		I1.super.a();
	}
	
	static void b() {}
}

interface I1 {
	default void a() {
		System.out.println("i1.a()");
	}
}

interface I2 {
	default void a() {
		System.out.println("i2.a()");
	}
}