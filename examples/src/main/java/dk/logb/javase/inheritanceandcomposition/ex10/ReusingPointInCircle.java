package dk.logb.javase.inheritanceandcomposition.ex10;

/*
 * Viser ex hvor komposition er godt, mens nedarvning
 * ville v�re t�beligt. Der er ikke brugt energi p�
 * indkapsling - hverken vha. visibility modifiers eller
 * accessor- eller mutator-metoder.
 */
public class ReusingPointInCircle
{

  public static void main(final String[] args)
  {
    Point p1 = new Point(0, 0);
    p1.setValuesBasedOnString("(12,-45)");

    // At bruge CircleByComposition giver selvforklarende kode
    CircleByComposition circleA = new CircleByComposition();
    // antyder det er cirklens radius der s�ttes, er selvforklarende
    circleA.radius = 10;
    // antyder cirklen har et center, hvis x og y s�ttes, er selvforklarende
    circleA.center.x = 5;
    circleA.center.y = 4;
    // antyder cirklen har et center, hvis v�rdier s�tte p� baggrund af en
    // String, er selvforklarende
    circleA.center.setValuesBasedOnString("(3,2)");

    // At bruge CircleByInheritance giver uforst�elig kode
    CircleByInheritance circleB = new CircleByInheritance();
    // antyder det er cirklens radius der s�ttes, er selvforklarende
    circleB.radius = 10;
    // hvad er cirklens x og y - er det center, �verste venstre hj�rne af
    // det rektangel der pr�cist ville omslutte cirklen - eller hvad?
    // er ikke selvforklarende!
    circleB.x = 5;
    circleB.y = 10;
    // hvad er der nu gang i? hvordan kan en cirkels v�rdier s�ttes udfra
    // den angivne String? hvor er radius - og hvad er det for v�rdier der
    // st�r i strengen? er ikke selvforklarende!
    circleB.setValuesBasedOnString("(6,7)");

    // For at tv�re i det tillader CircleByInheritance f�lgende:
    Point p = new CircleByInheritance();

    // Og endnu v�rre, hvis vi vil have cirkle-klassen til at nedarve
    // fra klassen Figure (som p.t. ikke er lavet), kan det ikke lade
    // sig g�re for CircleByInheritance, da den allerede HAR nedarvet
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

// Virker logisk da vi kan sige Circle HAS A Point
class CircleByComposition
{
  Point center = new Point();

  int radius;
}

// Virker ulogisk, da vi ikke kan sige Circle IS A SPECIAL KIND OF Point
class CircleByInheritance extends Point
{
  int radius;
}
