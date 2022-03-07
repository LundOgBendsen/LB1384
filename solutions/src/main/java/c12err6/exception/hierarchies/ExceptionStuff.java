/*
 * =========================================================
 * Ved n = 1 udskriver programmet:
 * Starter main
 * Starter a
 * Starter b
 * Starter c
 * Afslutter c
 * Afslutter b
 * Afslutter a
 * Finally i main
 * Afslutter main
 * Der kastes ingen exceptions nogen steder,
 * og finally k�res altid.
 * =========================================================
 * Ved n = 2 udskriver programmet:
 * Starter main
 * Starter a
 * Starter b
 * Starter c
 * Kaster MyException i c
 * Greb MyException i main
 * Finally i main
 * Afslutter main
 * En fejl af typen MyException kastes i metoden c,
 * fejlen gribes ikke i metoden b eller a, hvorfor
 * den bobler hele vejen op til main-metoden, hvor
 * den gribes af catch-blokken, der griber fejl af
 * typen MyException. Finally k�res altid.
 * =========================================================
 * Ved n = 3 udskriver programmet:
 * Starter main
 * Starter a
 * Starter b
 * Starter c
 * Kaster MyException i c
 * Greb MyException i b
 * Afslutter b
 * Afslutter a
 * Finally i main
 * Afslutter main
 * En fejl af typen MyException kastes i metoden c,
 * fejlen gribes i metoden b, hvorfor b�de b og a
 * afslutter p� normal vis. Finally k�res altid.
 * =========================================================
 * Ved n = 4 udskriver programmet:
 * Starter main
 * Starter a
 * Kaster Exception i a
 * Greb Exception i main
 * Finally i main
 * Afslutter main
 * En fejl af typen Exception kaste i metoden a,
 * (hvorfor a aldrig kalder videre til b). Fejlen
 * gribes af catch-blokken, der griber fejl af typen
 * Exception (og ikke allerede af den, der griber fejl
 * af typen MyException, da Exception ikke er en sub-type
 * af MyException). Finally k�res altid.
 */

package c12err6.exception.hierarchies;

public class ExceptionStuff {

	static boolean throwMyException = false;

	static boolean catchMyException = false;

	static boolean throwException = false;

	static int n = 1; // herefter 2, 3 eller 4.

	public static void main(final String[] args) {
		System.out.println("Starting main");
		try {
			switch (n) {
			case 4:
				throwException = true;
			case 3:
				catchMyException = true;
			case 2:
				throwMyException = true;
			}
			a();
		} catch (MyException e) {
			System.out.println("Caught a MyException in main");
		} catch (Exception e) {
			System.out.println("Caught an Exception in main");
		} finally {
			System.out.println("Finally in main");
		}
		System.out.println("Afslutter main");
	}

	static void a() throws Exception {
		System.out.println("Start a");
		if (throwException == true) {
			System.out.println("Throw Exception in a");
			throw new Exception();
		}
		b();
		System.out.println("End a");
	}

	static void b() throws MyException {
		System.out.println("Start b");
		if (catchMyException == true) {
			try {
				c();
			} catch (MyException e) {
				System.out.println("Caught a MyException in b");
			}
		} else {
			c();
		}
		System.out.println("End b");
	}

	static void c() throws MyException {
		System.out.println("Start c");
		if (throwMyException == true) {
			System.out.println("Throwing MyException in c");
			throw new MyException();
		}
		System.out.println("End c");
	}
}
