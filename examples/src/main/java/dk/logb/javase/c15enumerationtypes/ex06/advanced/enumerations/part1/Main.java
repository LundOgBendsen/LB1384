package dk.logb.javase.c15enumerationtypes.ex06.advanced.enumerations.part1;

public class Main {
	public static void main(final String[] args) {
		System.out.println(TrafficSignal.RED.description);
		System.out.println(TrafficSignal.RED.isNextTo(TrafficSignal.YELLOW));
	}

}
