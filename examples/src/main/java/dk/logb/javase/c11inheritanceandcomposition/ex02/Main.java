package dk.logb.javase.c11inheritanceandcomposition.ex02;

/**
 * Demonstrates composition where a CurvedLine is composed of several Points
 */

public class Main
{
  public static void main(final String[] args)
  {
    CurvedLine line = new CurvedLine();
    System.out.println("Empty CurvedLine: " + line);
    line.addPoint(new Point(1, 1));
    line.addPoint(new Point(4, 5));
    line.addPoint(new Point(2, 8));
    line.addPoint(new Point(4, 4));
    line.addPoint(new Point(5, 5));
    line.addPoint(new Point(10, 10));
    System.out.println("CurvedLine with 6 points: " + line);
  }
}
