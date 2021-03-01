package dk.logb.javase.enumerationtypes.ex03.type.safety;

import static dk.logb.javase.enumerationtypes.ex03.type.safety.TrafficSignal.YELLOW;

public class Main
{

  public static void main(final String[] args)
  {
    receiveSignal(YELLOW);
  }

  // Denne metode vil ALDRIG kunne f� en ulovlig v�rdi (ud over null, som vil
  // resultere i en NullPointerException, n�r der switches p� den).
  public static void receiveSignal(final TrafficSignal signal)
  {
    switch (signal)
    {
      case RED:
        System.out.println("Stop");
        break;
      case YELLOW:
        System.out.println("Gas op");
        break;
      case GREEN:
        System.out.println("K�r");
        break;
      default:
        assert false : "Unknown color";
        break;
    }
  }
}
