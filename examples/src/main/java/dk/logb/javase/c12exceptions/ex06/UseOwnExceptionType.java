package dk.logb.javase.c12exceptions.ex06;

/*
 * This program demonstrates:
 * (1) Definition of own exception type
 * (2) Instantiation if new exception object
 * (3) Throwing of the exception object
 * (4) Catching of the exception object
 * (5) Declaring that the method throws the exception
 */
public class UseOwnExceptionType {
	public static void main(final String[] args) {
		for (int day = 0; day <= 8; day++) {
			try {
				printNameOfDay(day);
			} catch (IllegalDayException e) {
				System.out.println("Caught Exception: " + e);
			}
		}
	}

	/*
	 * Declare in the header that this method may throw an IllegalDayException
	 */
	public static void printNameOfDay(final int dayNumber) throws IllegalDayException {
		switch (dayNumber) {
		case 1:
			System.out.println("Monday");
			return;
		case 2:
			System.out.println("Tuesday");
			return;
		case 3:
			System.out.println("Wednesday");
			return;
		case 4:
			System.out.println("Thursday");
			return;
		case 5:
			System.out.println("Friday");
			return;
		case 6:
			System.out.println("Saturday");
			return;
		case 7:
			System.out.println("Sunday");
			return;
		default:
			String msg = dayNumber + " is not a legal number for a day. ";
			msg += "Day must be an integer between 1 and 7.";

			/* Instantiation of a new exception object */
			IllegalDayException e = new IllegalDayException(msg);

			/* Throw the exception object */
			throw e;
		}
	}
}

/*
 * Define an Exception
 */
class IllegalDayException extends Exception {
	private static final long serialVersionUID = 1L;

	public IllegalDayException() {
		super();
	}

	public IllegalDayException(final String message) {
		super(message);
	}

	public IllegalDayException(final Throwable cause) {
		super(cause);
	}

	public IllegalDayException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
