package dk.logb.javase.enumerationtypes.ex01.enumeration.basics;

/*
 * I en enum opstilles en kommasepareret liste af netop den endelige m�ngde af
 * v�rdier, som enum'en tillader.
 * 
 * En referencevariabel af typen TrafficSignal, vil kun kunne referere til én af
 * de tre navngivne konstante eller null.
 */
public enum TrafficSignal
{
  RED,
  YELLOW,
  GREEN;
}

/*
 * Svarer i princippet nogenlunde til:
 * 
 * public enum TrafficSignal
 * {
 *   public static final TrafficSignal RED = new TrafficSignal();
 *   public static final TrafficSignal YELLOW = new TrafficSignal();
 *   public static final TrafficSignal GREEN = new TrafficSignal();
 * }
 * 
 */
