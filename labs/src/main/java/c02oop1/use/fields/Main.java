package c02oop1.use.fields;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		printAndPause("READY TO RUN YOUR CODE...");

		// ///////////////////////////////////
		// INSERT YOUR CODE AFTER THIS LINE //
		// ///////////////////////////////////


		
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
