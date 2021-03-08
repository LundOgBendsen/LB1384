package lab13.arr3.define.cup;

public class Cup
{

  Dice[] dice;

  void setDiceToUse(final Dice[] dice)
  {
    this.dice = dice;
  }

  RollResult throwDice()
  {
    if (this.dice == null)
    {
      System.out.println("Der er ingen terninger i b�gret");
      return null;
    }
    int[] results = new int[dice.length];
    for (int n = 0; n < dice.length; n++)
    {
      results[n] = dice[n].roll();
    }
    return new RollResult(results);
  }

  @Override
  public String toString()
  {
    String result = "Cup[";
    for (int i = 0; i < dice.length; i++)
    {
      result += dice[i].toString();
      if (i != (dice.length - 1))
      {
        result += ", ";
      }
    }
    return result += "]";
  }
}
