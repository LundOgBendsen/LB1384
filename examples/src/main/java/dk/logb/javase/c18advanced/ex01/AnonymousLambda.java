package dk.logb.javase.c18advanced.ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Demonstrates various ways of using lambda expressions, anonymous classes, named classes
 * and method references in conjunction with Comparable for sorting a List
 *
 */
public class AnonymousLambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","c","b","B");
		System.out.println("Unsorted: "+list);
		
		Collections.sort(list, new Comp());
		System.out.println("Named Comparator: "+list);	
		
		Collections.sort(list);
		System.out.println("Natural sort: "+list);
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("Anonymous Comparator: "+list);	
		
		Collections.sort(list, String::compareToIgnoreCase);
		System.out.println("Ignoring case, using method reference: "+list);	
		
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		System.out.println("After lambde reverse, using forEach: ");	
		
		list.forEach(System.out::println);
	}
}

class Comp implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}