package dk.logb.javase.inheritanceandcomposition.ex11;

/*
 * Viser endnu ex hvor komposition er godt, mens nedarvning
 * virkeligt virker endnu mere t�beligt end i eksemplet fra
 * ReusingPointInCircle.
 */
public class ReusingPointInLine
{
  public static void main(final String[] args)
  {
    Point p1 = new Point(0, 0);
    p1.setValuesBasedOnString("(12,-45)");

    // At bruge LineByComposition giver selvforklarende kode
    LineByComposition lineA = new LineByComposition();
    // Vi s�tter v�rdien af endernes punkter, er selvforklarende
    lineA.firstPoint.x = 3;
    lineA.firstPoint.y = 4;
    lineA.secondPoint.setValuesBasedOnString("(8,8)");

    // At bruge LineByInheritance giver uforst�elig kode
    LineByInheritance lineB = new LineByInheritance();
    // Vi s�tter v�rdien af endernes punkter, giver mystisk kode
    lineB.x = 5; // Hvad er x?
    lineB.y = 2; // Hvad er y?
    lineB.otherPoint.x = 1; // og hvad er nu otherPoint?
    lineB.otherPoint.y = 2;
    lineB.setValuesBasedOnString("(8,8)"); // hvordan er (8,8) nok til at
    // s�tte en linies v�rdier???

    // For at tv�re i det tillader CircleByInheritance f�lgende:
    Point p = new LineByInheritance();

    // Og endnu v�rre, hvis vi vil have linie-klassen til at nedarve
    // fra klassen Figure (som p.t. ikke er lavet), kan det ikke lade
    // sig g�re for LineByInheritance, da den allerede HAR nedarvet
    // fra Point og Java underst�tter ikke multipel nedarvning (dvs.
    // at en klasse nedarver fra mere end �n klasse).
  }
}

class Point
{
  int x, y;

  Point(final int x, final int y)
  {
    this.x = x;
    this.y = y;
  }

  Point()
  {
    this(0, 0);
  }

  // Konverterer String p� formen "(23,4)" til et point.
  // Det checkes IKKE om strengen er rigtigt opbygget.
  void setValuesBasedOnString(final String s)
  {
    String stringX = s.substring(s.indexOf('(') + 1, s.indexOf(','));
    String stringY = s.substring(s.indexOf(',') + 1, s.indexOf(')'));
    System.out.println("(" + stringX + "," + stringY + ")");
  }
}

// Virker logisk da vi kan sige Line HAS TWO Points
class LineByComposition
{
  Point firstPoint = new Point();

  Point secondPoint = new Point();
}

// Virker ulogisk, da vi ikke kan sige Line IS A SPECIAL KIND OF Point
class LineByInheritance extends Point
{
  // Vi er n�dt til ogs� at bruge komposition
  Point otherPoint = new Point();
}
