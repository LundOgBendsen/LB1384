package dk.logb.javase.c07operatorsandmath.ex02;

import java.math.BigDecimal;

/*
 * Demonstrates a few traps related to floating point literals and BigDecimal
 * double only has a precision of 15 decimals.
 * 1,111,111,111.11  dollars in indonesian rupiahs is 15,686,436,434,867,81
 * and cannot be held in a double
 * 
 * Therefore BigDecimal is the standard in the financial industry.
 */
public class TestBigDecimal {
	/* Note that, amazingly, it is possible to define a literal that does not fit in the variable type! */
	static double x =  1.111000000000000000000000001d;
	static String s = "1.111000000000000000000000001";
	static double y =  1.111d;
	
	public static void main(String[] args) {
		System.out.println("Print the value of x = 1.111000000000000000000000001d");
		System.out.println(""+x);
		
		System.out.println("Print the value of s = \"1.111000000000000000000000001\";");
		System.out.println(s);
		
		BigDecimal bd = new BigDecimal(x);
		System.out.println("Print the value of a BigDecimal based on x");
		System.out.println(bd);
		
		bd = new BigDecimal(y);
		System.out.println("Print the value of a BigDecimal based on y");
		System.out.println(bd);
		
		bd = new BigDecimal(s);
		System.out.println("Print the value of a BigDecimal based on s");
		System.out.println(bd);
				
	}
}
