/*
 * Enums bruges ofte sammen med static imports.
 */
package dk.logb.javase.enumerationtypes.ex02.importing.enumerations;

import static dk.logb.javase.enumerationtypes.ex02.importing.enumerations.TrafficSignal.GREEN;
import static dk.logb.javase.enumerationtypes.ex02.importing.enumerations.TrafficSignal.RED;
import static dk.logb.javase.enumerationtypes.ex02.importing.enumerations.TrafficSignal.YELLOW;

public class Main
{

  @SuppressWarnings("unused")
  public static void main(final String[] args)
  {

    TrafficSignal ts1 = RED;
    TrafficSignal ts2 = YELLOW;
    TrafficSignal ts3 = GREEN;
  }
}
