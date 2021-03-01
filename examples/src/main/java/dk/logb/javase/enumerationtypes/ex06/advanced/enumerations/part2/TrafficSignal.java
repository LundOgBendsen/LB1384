package dk.logb.javase.enumerationtypes.ex06.advanced.enumerations.part2;

import static java.lang.Math.abs;

public enum TrafficSignal
{

  // Man kan ogs� give enums deres egne varianter af metoder.
  // Det g�res med samme syntaks, som n�r man definerer anonyme klasser.
  // Her har GREEN f�et sin egen variant af metoden allowsDriving:
  RED("Stop"),
  YELLOW("Start engine"),
  GREEN("Go")
  {
    @Override
    public boolean allowsDriving()
    {
      return true;
    }
  };

  public boolean allowsDriving()
  {
    return false;
  }

  String description;

  TrafficSignal(final String description)
  {
    this.description = description;
  }

  public boolean isNextTo(final TrafficSignal signal)
  {
    return abs(this.ordinal() - signal.ordinal()) == 1;
  }
}
