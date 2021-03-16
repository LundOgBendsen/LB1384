package lab01.oop1.use.fields;

public class Main {

	@SuppressWarnings("unused")
	public static void main(final String[] args) throws Exception {
		printAndPause("READY TO RUN YOUR CODE...");

		// ///////////////////////////////////
		// INSERT YOUR CODE AFTER THIS LINE //
		// ///////////////////////////////////

		// Declares a reference variabel
		Car car01;
		printAndPause("Car car01;");

		// Creates a new object and assigns it to a reference variable
		car01 = new Car();
		printAndPause("car01 = new Car();");

		Car car02 = new Car();
		printAndPause("Car car02 = new Car();");

		Car car03 = new Car();
		printAndPause("Car car03 = new Car();");

		Car car04 = new Car();
		printAndPause("Car car04 = new Car();");

		// Changes the state of the objects
		car01.running = true;
		printAndPause("car01.running = true;");

		car01.direction = 1;
		printAndPause("car01.direction = 1;");

		car03.running = true;
		printAndPause("car03.running = true;");

		car04.direction = 3;
		printAndPause("car04.direction = 3;");

		// Multiple references to the same object
		Car car05 = car01;
		printAndPause("Car car05 = car01;");

		car05.direction = 2;
		printAndPause("car05.direction = 2;");

		car01.direction = 3;
		printAndPause("car01.direction = 3;");

		// Use a reference to another object
		car05 = car03;
		printAndPause("car05 = car03;");

		car05.direction = 2;
		printAndPause("car05.direction = 2;");

		// Let a few objects get garbage collected
		car02 = null;
		printAndPause("car02 = null;");

		car04 = car01;
		printAndPause("car04 = car01;");

		// What happens if we set direction to an illegal value?
		car04.direction = 8;
		printAndPause("car04.direction = 8");

		car04.direction = 2;
		printAndPause("car04.direction = 2");

		// ////////////////////////////////////
		// INSERT YOUR CODE BEFORE THIS LINE //
		// ////////////////////////////////////

		printAndPause("DONE RUNNING YOUR CODE...");

		System.exit(0);
	}

	private static void printAndPause(final String msg) {
		DrivingArea.mainThread = Thread.currentThread();
		DrivingArea.singleton.setMessage(msg);
		System.gc();
		DrivingArea.singleton.refresh();
		try {
			Thread.sleep(1000 * 60 * 60);
		} catch (InterruptedException e) {
			// do nothing
		}
	}
}
