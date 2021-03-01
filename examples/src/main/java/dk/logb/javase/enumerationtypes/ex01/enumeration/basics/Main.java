/*
 * Enumerated types (enums) er en ny kategori af reference-typer.
 * En enum definerer en endelig m�ngde af v�rdier p� en typest�rk m�de, dvs. at
 * en variabel med enum'en som type *kun* vil kunne referere til en af de
 * enum-instanser, der er i en opstillede m�ngde af instanser (eller null).
 */
package dk.logb.javase.enumerationtypes.ex01.enumeration.basics;

public class Main
{

  public static void main(final String[] args)
  {

    // Metoderne name() og toString() returnerer navnet p� en enum-konstant.
    // Forskellen p� name() og toString() er, at name() er final, og derfor
    // altid returnerer netop navnet p� enum-konstanten. Metoden toString
    // derimod kan overrides, s� den returnerer en mere sigende streng.
    System.out.println(TrafficSignal.RED.toString());
    System.out.println(TrafficSignal.RED.name());

    // Enum-v�rdier tilg�s som almindelige konstante i en klasse.
    TrafficSignal trafficLight = TrafficSignal.RED;

    // Man kan lave switch p� en enum type (virkede tidligere kun p� ints).
    switch (trafficLight)
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

    // Man kan vha. Enum.valueOf() f� fat i en Enum-v�rdi udfra en String!
    // NB: Er case-sensitive (kaster evt. IllegalArgumentException).
    System.out.println(TrafficSignal.RED == TrafficSignal.valueOf("RED"));

    // Man kan f� fat i et array med alle enum-v�rdier i en enum.
    // Kommer ud i den r�kkef�lge, hvor de er defineret.
    TrafficSignal[] signals = TrafficSignal.values();
    System.out.print("|");
    for (TrafficSignal current : signals)
    {
      System.out.print(current + "|"); // |RED|YELLOW|GREEN|
    }
    System.out.println();

    // Man kan f� fat i index-pladsen for en Enum-v�rdi (startende fra 0).
    // Index-tallene svarer til r�kkef�lgen enum-konstantene er defineret i.
    // Ordinal betyder i �vrigt ordenstal p� dansk.
    System.out.println(TrafficSignal.RED.ordinal()); // 0
    System.out.println(TrafficSignal.YELLOW.ordinal()); // 1
    System.out.println(TrafficSignal.GREEN.ordinal()); // 2

    // Alle enums er subtyper af klassen java.lang.Enum (som ikke kan
    // subtypes vha. almindelige klasser).
    Object o = TrafficSignal.RED;
    System.out.println(o instanceof Enum<?>); // true
  }
}
