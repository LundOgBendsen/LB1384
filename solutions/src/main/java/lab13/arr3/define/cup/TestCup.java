package lab13.arr3.define.cup;

public class TestCup
{

  public static void main(final String[] args)
  {
    System.out.println();

    Dice[] diceToPutInCup = new Dice[4];
    for (int n = 0; n < 4; n++)
    {
      diceToPutInCup[n] = new Dice(6);
    }

    Cup myCup = new Cup();

    myCup.setDiceToUse(diceToPutInCup);

    System.out.println(myCup);
    System.out.println();

    RollResult result = myCup.throwDice();

    System.out.println("The result of the roll was " + result.toString());

    System.out.println();
    System.out.println("The sum of the roll was " + result.getTotal());

    System.out.println();
    // there is 4 dice in the cup - print the result of each of them
    for (int n = 0; n < 4; n++)
    {
      System.out.println("The die no " + n + " rolled: " + result.getRollOfDie(n));
    }
  }
}
