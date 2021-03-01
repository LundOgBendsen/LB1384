package lab01.use.fields;

public class Main {

	public static void main(String[] args) throws Exception {

		printAndPause("READY TO RUN YOUR CODE...");

		// ///////////////////////////////////
		// INSERT YOUR CODE AFTER THIS LINE //
		// ///////////////////////////////////

		Car car01 = new Car();

		// ////////////////////////////////////
		// INSERT YOUR CODE BEFORE THIS LINE //
		// ////////////////////////////////////

		printAndPause("DONE RUNNING YOUR CODE...");

		System.exit(0);
	}

	private static void printAndPause(String msg) {
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
