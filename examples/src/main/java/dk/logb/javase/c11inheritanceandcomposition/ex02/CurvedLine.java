package dk.logb.javase.c11inheritanceandcomposition.ex02;

import java.util.ArrayList;

public class CurvedLine {

	private final ArrayList<Point> points = new ArrayList<>();

	public void addPoint(final Point point) {
		points.add(point);
	}

	public Point getFirstPoint() {
		if (points.size() > 0) {
			return points.get(0);
		} else {
			return null;
		}
	}

	public Point getLastPoint() {
		if (points.size() > 0) {
			int indexOfLastPoint = points.size() - 1;
			return points.get(indexOfLastPoint);
		} else {
			return null;
		}
	}

	public int getNumberOfPoints() {
		return points.size();
	}

	public Point getPoint(final int number) {
		if (number > 0 && number < points.size()) {
			return points.get(number);
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Line" + points;
	}
}
