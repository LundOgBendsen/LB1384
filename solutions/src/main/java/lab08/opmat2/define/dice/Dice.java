package lab08.opmat2.define.dice;

import java.util.Random;

public class Dice
{

  static Random random = new Random();

  private final int numberOfSides;

  public Dice(final int numberOfSides)
  {
    this.numberOfSides = numberOfSides;
  }

  @Override
  public String toString()
  {
    return "Die[sides=" + this.numberOfSides + "]";
  }

  public double getExpectedAverage()
  {
    return (((double) this.numberOfSides - 1) / 2) + 1;
  }

  public int roll()
  {
    return Dice.random.nextInt(numberOfSides) + 1;
  }
}
