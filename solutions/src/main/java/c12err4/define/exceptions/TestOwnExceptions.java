package c12err4.define.exceptions;

public class TestOwnExceptions {

	public static void main(String[] args) {

		System.out.println("Kalder throwMyCheckedException");
		try {
			throwMyCheckedException();
		} catch (MyCheckedException e) {
			System.out.println("Caught a MyCheckedException");
		}

		try {
			System.out.println("calling throwMyUncheckedException in try...catch");
			throwMyUncheckedException();
		} catch (MyUncheckedException e) {
			System.out.println("Caught a MyUncheckedException");
		}

		System.out.println("Calling throwMyUncheckedException without try...catch");
		throwMyUncheckedException();
	}

	public static void throwMyCheckedException() throws MyCheckedException {
		throw new MyCheckedException();
	}

	public static void throwMyUncheckedException() {
		throw new MyUncheckedException();
	}
}
