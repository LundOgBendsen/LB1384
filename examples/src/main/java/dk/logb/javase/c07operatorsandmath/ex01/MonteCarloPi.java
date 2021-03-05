package dk.logb.javase.c07operatorsandmath.ex01;

import java.util.Random;

/**
 * Demostrates how to find Pi using the (rather stupid) Monte Carlo algorithm.
 * 
 * Monte Carlo algorithms are named after the city state renouned for its
 * casinos because they rely on chance and statistics.
 * 
 * The idea is that a random point in a 1*1 square will be either in a quarter
 * circle with radius 1 or not. Counting the number of hits compared to the
 * total will give a number proportional to Pi
 *
 */

public class MonteCarloPi {
	static final long N = 100000000l;

	public static void main(String[] args) {
		long n = 0;
		Random rand = new Random();
		for (long i = 1; i < N; i++) {
			/* a random x,y value */
			double x = rand.nextDouble();
			double y = rand.nextDouble();
			/* distance from 0,0 */
			double r = Math.sqrt(x * x + y * y);
			/* inside or outside? */
			if (r < 1) {
				n++;
			}
			if (i % 10000 == 0) {
				System.out.println(4.0 * n / i);
			}
		}
		System.out.println("\n"+Math.PI);
	}
}
