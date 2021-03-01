package dk.logb.javase.enumerationtypes.ex04.common.methods;

import static dk.logb.javase.enumerationtypes.ex04.common.methods.TrafficSignal.GREEN;
import static dk.logb.javase.enumerationtypes.ex04.common.methods.TrafficSignal.RED;
import static dk.logb.javase.enumerationtypes.ex04.common.methods.TrafficSignal.YELLOW;
import static java.lang.System.identityHashCode;
import static java.lang.System.out;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main
{

  @SuppressWarnings("unchecked")
  public static void main(final String[] args) throws Exception
  {

    TrafficSignal signal01 = RED;
    TrafficSignal signal02 = YELLOW;
    TrafficSignal signal03 = GREEN;

    // Deserialisering h�ndterer enums specielt, s� der aldrig bliver lavet
    // dubletter af en enum-v�rdi. Desuden kan man ikke clone en enum-v�rdi.
    out.println(signal01 == RED); // true (ALTID)

    // equals: er final i enums, og er baseret p� ==
    out.println(signal02.equals(YELLOW)); // true (ALTID)
    out.println(signal02.equals(GREEN)); // false (ALTID)

    // hashCode: er final i enums, og er baseret p� objekt-identitet
    out.println(identityHashCode(RED) == RED.hashCode()); // true (ALTID)

    // toString: kan overrides, men returnerer som default navnet p�
    // v�rdien (fx "RED" for TrafficLight.RED)
    out.println(RED); // "RED"
    out.println(signal03); // "GREEN"

    // compareTo: enums implementerer Comparable og bruger en sortering
    // svarende til den r�kkef�lge, som v�rdierne i enum'en er skrevet p�.
    SortedSet set = new TreeSet();
    set.add(YELLOW);
    set.add(GREEN);
    set.add(RED);
    out.println(set);
  }
}
