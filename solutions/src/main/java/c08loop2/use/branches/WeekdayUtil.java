package c08loop2.use.branches;

public class WeekdayUtil {

	public static void main(String[] args) {
		System.out.println("Friday is day no ");
		System.out.println(fromNameToNumber("Friday"));
		System.out.println("The second day of the week is ");
		System.out.println(fromNumberToName(2));
	}

	static String fromNumberToName(int day) {
		switch (day) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			return "UNKNOWN";
		}
	}

	static int fromNameToNumber(String name) {
		if ("Monday".equals(name)) {
			return 1;
		} else if ("Tuesday".equals(name)) {
			return 2;
		} else if ("Wednesday".equals(name)) {
			return 3;
		} else if ("Thursday".equals(name)) {
			return 4;
		} else if ("Friday".equals(name)) {
			return 5;
		} else if ("Saturday".equals(name)) {
			return 6;
		} else if ("Sunday".equals(name)) {
			return 7;
		} else {
			return -1;
		}
	}

}
