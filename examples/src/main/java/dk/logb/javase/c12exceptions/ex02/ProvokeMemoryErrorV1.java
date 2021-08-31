package dk.logb.javase.c12exceptions.ex02;

/*
 * Demonstrates how to provoke an OutOfMemoryError
 */
import java.util.Collection;
import java.util.LinkedList;

public class ProvokeMemoryErrorV1 {
	public static void main(final String[] args) {
		Collection<Integer[]> c = new LinkedList<>();
		while (true) {
			c.add(new Integer[100000000]);
		}
	}
}
