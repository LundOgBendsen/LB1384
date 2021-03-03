package dk.logb.javase.c06proceduralelements.ex02;

/*
 * Demonstrates how the enhanced for loop can be used to traverse an array but not to change values in the array.
 */
public class ForEach {

	public static void main(final String[] args) {
		Integer[] primes = { 1, 2, 3, 5, 7 }; // autoboxing

		for (int i : primes) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		for (int i : primes) {
			i = (int) (Math.random() * 5); // no effect as i is a local variable.
			System.out.print(i+" ");
		}

		System.out.println();

		for (int i : primes) {
			System.out.print(i+" ");
		}
	}
}
