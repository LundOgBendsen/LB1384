package dk.logb.javase.c09arrays.ex01;

import java.util.ArrayList;

/*
 * Demonstrates basic use of type safe ArrayList.
 */
public class ArrayListExample {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		ArrayList<String> v = new ArrayList<>();

		v.add("hej");
		v.add("med");
		v.add("dig!");

		String first = v.get(0);
		String second = v.get(1);
		String third = v.get(2);

		for (String s : v) {
			System.out.println(s);
		}

	}
}
