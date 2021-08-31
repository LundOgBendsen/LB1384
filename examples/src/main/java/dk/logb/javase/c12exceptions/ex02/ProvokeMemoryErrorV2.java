package dk.logb.javase.c12exceptions.ex02;

/*
 * Shows how an Error can be handled.
 * This is almost never a good idea to do in a real program
 */

import java.util.Collection;
import java.util.LinkedList;

public class ProvokeMemoryErrorV2 {
	public static void main(final String[] args) {
		Collection<Integer[]> c = new LinkedList<>();
		System.out.println("Start filling the list with objects!");
		while (true) {
			try {
				c.add(new Integer[10000000]);
			} catch (OutOfMemoryError e) {
				c.clear();
				System.out.println(e + "\nJust cleared the list!");

				String msg = "\nStart filling the list with objects again!";
				System.out.println(msg);
			}
		}
	}
}
