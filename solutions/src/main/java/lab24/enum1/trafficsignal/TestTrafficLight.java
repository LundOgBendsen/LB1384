package lab24.enum1.trafficsignal;

public class TestTrafficLight
{
  public static void main(final String[] args)
  {
    TrafficLight trafficlight = new TrafficLight();
    trafficlight.setSignalColor(SignalColor.GREEN);
    System.out.println(trafficlight);
    trafficlight.setSignalColor(SignalColor.RED);
    System.out.println(trafficlight);
  }
}
