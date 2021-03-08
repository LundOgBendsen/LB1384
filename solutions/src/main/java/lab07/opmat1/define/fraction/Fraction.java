package lab07.opmat1.define.fraction;

public class Fraction
{

  // e.g. ved 5/6 er 5 numerator og 6 denominator
  int numerator; // t�ller

  int denominator; // n�vner

  public Fraction(final int numerator, final int denominator)
  {
    this.numerator = numerator;
    this.denominator = denominator;
    if (this.denominator == 0)
    {
      String msg = "";
      msg += "A denominator in a Fraction cannot be 0, ";
      msg += "thus the fraction [" + numerator + "/";
      msg += denominator + "] is illegal";
      throw new IllegalArgumentException(msg);
    }
  }

  // e.g. gets 6/4 as 1 1/2
  @Override
  public String toString()
  {
    return this.numerator + "/" + this.denominator;
  }

  public double getAsDouble()
  {
    // remember that type(int) * type(int) --> type(int)
    // whereas type(double) * type(int) --> type(double)
    return (1.0 * this.numerator) / this.denominator;
  }

  // e.g 4/6 --> 2/3
  // forkortetBr�k = st�rsteF�llesN�vner( t�ller ) / st�rsteF�llesN�vner( n�vner )
  // reducedFraction = greatestCommonDivisor( numerator ) / greatestCommonDenominator( denominator )
  public Fraction getAsReduced()
  {
    int greatestCommonDivisor = Util.greatestCommonDenominator(this.numerator, this.denominator);
    int newNumerator = this.numerator / greatestCommonDivisor;
    int newDenominator = this.denominator / greatestCommonDivisor;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
  }

  // e.g. 1/2 * 1/3 = 1/6
  // (a/b) * (c/d) = (a*c)/(b*d)
  // gang t�ller med t�ller og n�vner med n�vner
  public Fraction multiply(final Fraction other)
  {
    int newNumerator = this.numerator * other.numerator;
    int newDenominator = this.denominator * other.denominator;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
  }

  // e.g. 1/6 / 1/2 = 2/6
  // (a/b) / (c/d) = (a*d) / (c*b)
  // gang t�ller med n�vner og n�vner med t�ller
  public Fraction divide(final Fraction other)
  {
    int newNumerator = this.numerator * other.denominator;
    int newDenominator = this.denominator * other.numerator;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
  }

  // e.g. 1/2 + 2/3 = 3/6 + 4/6 = 7/6
  // (a/b) + (c/d) = ((a*d)+(c*b)) / (b*d)
  public Fraction add(final Fraction other)
  {
    int newDenominator = this.denominator * other.denominator;
    int newNumeratorForThis = this.numerator * other.denominator;
    int newNumeratorForOther = other.numerator * this.denominator;
    int newNumerator = newNumeratorForThis + newNumeratorForOther;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
  }

  // e.g. 1/2 - 1/4 = 4/8 - 2/8 = 2/8
  // (a/b) - (c/d) = ((a*d)-(c*b)) / (b*d)
  public Fraction subtract(final Fraction other)
  {
    int newDenominator = this.denominator * other.denominator;
    int newNumeratorForThis = this.numerator * other.denominator;
    int newNumeratorForOther = other.numerator * this.denominator;
    int newNumerator = newNumeratorForThis - newNumeratorForOther;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
  }
}
