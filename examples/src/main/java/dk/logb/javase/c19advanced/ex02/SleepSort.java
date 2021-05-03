package dk.logb.javase.c19advanced.ex02;
/**
 * Demonstrates how to (in a silly way) sort integers given as input
 *
 */
public class SleepSort {
	/**
	 * Prints out arguments in order
	 * @param args command line arguments that must be parsable as integers. Example: 4 1 11 9 5
	 */
	public static void main(String[] args) {
		for (String arg : args) {
			int n = Integer.parseInt(arg);
			new Thread(new Sleeper(n)).start();
		}
	}
}
 /**
  * This is the runnable class that contains the code to be run in each thread.
  *
  */
class Sleeper implements Runnable{
	private final int secs;
	public Sleeper(int secs) {
		this.secs = secs;
	}

	/**
	 * When a thread is started with an instance Runnable, the run method will be called.
	 */
	@Override
	public void run() {
		/* Sleep for the number of seconds this object was asked to sleep */ 
		try {
			Thread.sleep(secs*1000);
		} catch (InterruptedException e) {
			e.printStackTrace(); // Not very nice, but should not happen normally
		}
		System.out.println(secs); // Print out the number
	}
}