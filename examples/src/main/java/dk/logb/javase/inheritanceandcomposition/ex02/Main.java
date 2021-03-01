package dk.logb.javase.inheritanceandcomposition.ex02;

/*
 * Viser ex p� brugen af komposition. Her bruges b�de
 * Point og Vector-klasserne i en ny klasse CurvedLine.
 */

public class Main
{
  public static void main(final String[] args)
  {
    CurvedLine line = new CurvedLine();
    System.out.println("Tom CurvedLine: " + line);
    line.addPoint(new Point(1, 1));
    line.addPoint(new Point(4, 5));
    line.addPoint(new Point(2, 8));
    line.addPoint(new Point(4, 4));
    line.addPoint(new Point(5, 5));
    line.addPoint(new Point(10, 10));
    System.out.println("CurvedLine med 6 punkter: " + line);
  }
}
