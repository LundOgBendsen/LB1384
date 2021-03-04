package dk.logb.javase.c11inheritanceandcomposition.ex10;


/*
 * Shows an example where composition works well and inheritance is fragile
 */
public class ReusingPointInCircle {

	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		Point p1 = new Point(0, 0);
		p1.setValuesBasedOnString("(12,-45)");

		/* Operations on CircleByComposition seem logical and reasonable */
		CircleByComposition circleA = new CircleByComposition();
		circleA.radius = 10;
		circleA.center.x = 5;
		circleA.center.y = 4;
		circleA.center.setValuesBasedOnString("(3,2)");

		/* Some operations on CircleByInheritance are fine */
		CircleByInheritance circleB = new CircleByInheritance();
		circleB.radius = 10;
		circleB.x = 5;
		circleB.y = 10;
		/* but here it breaks down; what are the 2 values of a circle? */ 
		circleB.setValuesBasedOnString("(6,7)");

		/* The following would also be legal but probably nonsensical */
		Point p = new CircleByInheritance();
	}
}

class Point {
	int x, y;

	Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
		this(0, 0);
	}

	/* Sets x and y based on a String in the form "(x,y)" where x and y are integers */
	void setValuesBasedOnString(final String s) {
		x = Integer.valueOf(s.substring(s.indexOf('(') + 1, s.indexOf(',')));
		y = Integer.valueOf(s.substring(s.indexOf(',') + 1, s.indexOf(')')));
	}
}

/* Seems logical since we can say that a circle HAS a Point */
class CircleByComposition {
	Point center = new Point();
	int radius;
}

/* Seems illogical since we cannot say that a circle is a special kind of Point */
class CircleByInheritance extends Point {
	int radius;
}
