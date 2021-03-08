package lab08.opmat2.define.dice;

public class DiceTest
{

  public static void main(String[] args)
  {

    System.out.println();
    Dice d6 = new Dice(6);
    System.out.println("d6.toString() " + d6.toString());
    System.out.println("Forventet gennemsnit for d6 er " + d6.getExpectedAverage());
    System.out.println("Slag 1 med d6 gav " + d6.roll());
    System.out.println("Slag 2 med d6 gav " + d6.roll());
    System.out.println("Slag 3 med d6 gav " + d6.roll());
    System.out.println("Slag 4 med d6 gav " + d6.roll());
    System.out.println("Slag 5 med d6 gav " + d6.roll());
    System.out.println("Slag 6 med d6 gav " + d6.roll());
    System.out.println("Slag 7 med d6 gav " + d6.roll());
    System.out.println("Slag 8 med d6 gav " + d6.roll());

    System.out.println();
    Dice d4 = new Dice(4);
    System.out.println("d4.toString() " + d4.toString());
    System.out.println("Forventet gennemsnit for d4 er " + d4.getExpectedAverage());
    System.out.println("Slag 1 med d4 gav " + d4.roll());
    System.out.println("Slag 2 med d4 gav " + d4.roll());
    System.out.println("Slag 3 med d4 gav " + d4.roll());
    System.out.println("Slag 4 med d4 gav " + d4.roll());
    System.out.println("Slag 5 med d4 gav " + d4.roll());
    System.out.println("Slag 6 med d4 gav " + d4.roll());
    System.out.println("Slag 7 med d4 gav " + d4.roll());
    System.out.println("Slag 8 med d4 gav " + d4.roll());
  }
}
