package dk.logb.javase.enumerationtypes.ex05.advanced.enumerations.part1;

import static java.lang.Math.abs;

public enum TrafficSignal
{

  // Enum-v�rdierne skal defineres som det f�rste i en enum.
  // Her aktiverer hver enkelt v�rdi den constructor, der tager en String.
  RED("Stop"),
  YELLOW("Start engine"),
  GREEN("Go");

  // Enums m� gerne have felter
  String description;

  // Enums kan have constructors (de er automatisk private)
  TrafficSignal(final String description)
  {
    this.description = description;
  }

  // Enums m� godt have metoder
  public boolean isNextTo(final TrafficSignal signal)
  {
    return abs(this.ordinal() - signal.ordinal()) == 1;
  }
}

class Main
{
  public static void main(final String[] args)
  {
    System.out.println(TrafficSignal.RED.description);
    System.out.println(TrafficSignal.RED.isNextTo(TrafficSignal.YELLOW));
  }
}
