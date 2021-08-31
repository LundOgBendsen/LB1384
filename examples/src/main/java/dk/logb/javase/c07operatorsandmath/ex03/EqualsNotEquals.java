package dk.logb.javase.c07operatorsandmath.ex03;
/**
 * 
 * Demonstrates the difference between equals() and "=="
 */
public class EqualsNotEquals {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String s1 = "str";
		String s2 = "str";
		String s3 = new String("str");
		System.out.println("s1 == s2 "+(s1 == s2)); // true
		System.out.println("s1 == s3 "+(s1 == s3)); // false
		System.out.println("s2 == s3 "+(s2 == s3)); // false
		System.out.println("s1.equals(s2) "+s1.equals(s2)); // true
		System.out.println("s1.equals(s3) "+s1.equals(s3)); // true
		System.out.println("s2.equals(s3) "+s2.equals(s3)); // true
		
		Integer i1 = Integer.parseInt("10");
		Integer i2 = Integer.parseInt(new String("10"));
		Integer i3 = new Integer("10");
		Integer i4 = new Integer("10");
		
		System.out.println("i1 == i2 "+(i1 == i2)); // true
		System.out.println("i1 == i3 "+(i1 == i3)); // false
		System.out.println("i4 == i3 "+(i4 == i3)); // false
		System.out.println("i1.equals(i3) "+i1.equals(i3)); // true
		
		
	}
}
