package lab07.opmat1.define.fraction;

public class FractionTest {

	public static void main(final String[] args) {

		System.out.println();

		Fraction f1 = new Fraction(2, 3);
		System.out.println("Fraction f1 = new Fraction( 2, 3 );");
		System.out.println("f1.toString() --> " + f1.toString());
		System.out.println("f1.getAsDouble() --> " + f1.getAsDouble());
		System.out.println("f1.getAsReduced() --> " + f1.getAsReduced());
		System.out.println();

		Fraction f2 = new Fraction(4, 8);
		System.out.println("Fraction f2 = new Fraction( 4, 8 );");
		System.out.println("f2.toString() --> " + f2.toString());
		System.out.println("f2.getAsDouble() --> " + f2.getAsDouble());
		System.out.println("f2.getAsReduced() --> " + f2.getAsReduced());
		System.out.println();

		Fraction f3 = f1.multiply(f2);
		System.out.println("Fraction f3 = f1.multiply( f2 );");
		System.out.println("f3.toString() --> " + f3.toString());
		System.out.println("f3.getAsDouble() --> " + f3.getAsDouble());
		System.out.println("f3.getAsReduced() --> " + f3.getAsReduced());
		System.out.println();

		Fraction f4 = f1.divide(f2);
		System.out.println("Fraction f4 = f1.divide( f2 );");
		System.out.println("f4.toString() --> " + f4.toString());
		System.out.println("f4.getAsDouble() --> " + f4.getAsDouble());
		System.out.println("f4.getAsReduced() --> " + f4.getAsReduced());
		System.out.println();

		Fraction f5 = f1.add(f2);
		System.out.println("Fraction f5 = f1.add( f2 );");
		System.out.println("f5.toString() --> " + f5.toString());
		System.out.println("f5.getAsDouble() --> " + f5.getAsDouble());
		System.out.println("f5.getAsReduced() --> " + f5.getAsReduced());
		System.out.println();

		Fraction f6 = f1.subtract(f2);
		System.out.println("Fraction f6 = f1.subtract( f6 );");
		System.out.println("f4.toString() --> " + f6.toString());
		System.out.println("f4.getAsDouble() --> " + f6.getAsDouble());
		System.out.println("f4.getAsReduced() --> " + f6.getAsReduced());
		System.out.println();
	}
}
