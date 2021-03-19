package lab26.poly2.polymorphism.and.types;

public class TestPolymorphism {

	public static void main(final String[] args) {
		// //////////////////////////////////
		// (a) Prints c( ) in E
		// E x = new E();
		// x.c();

		// //////////////////////////////////
		// (b) Compile error. F is not a tubtype of A.
		// A x = new F();
		// x.a();

		// //////////////////////////////////
		// (c) Prints 3.14 (not considered good practise).
		// F x = new F();
		// System.out.println(x.PI);

		// //////////////////////////////////
		// (d) Compile error. Reference type D does not know PI.
		// D x = new E();
		// System.out.println(x.PI);

		// //////////////////////////////////
		// (e) Runtime error. An instnce of E cannot be cast to F.
		// B x = new E();
		// F y = (F) x;
		// y.a();

		// //////////////////////////////////
		// (f) Prints: c( ) in E
		// B x = new E();
		// D y = (D) x;
		// y.c();

		// //////////////////////////////////
		// (g) Prints: c( ) in D
		// C x = new D();
		// x.c();

		// //////////////////////////////////
		// (h) Compile error. C is abstrakt and cannot be instantiated.
		// A x = new C();
		// x.a();

		// //////////////////////////////////
		// (i) Compile error. Object does not know methos c
		// Object x = new D();
		// x.c();

		// //////////////////////////////////
		// (j) Prints: a( ) in C
		// D x = new D();
		// x.a();
	}
}
