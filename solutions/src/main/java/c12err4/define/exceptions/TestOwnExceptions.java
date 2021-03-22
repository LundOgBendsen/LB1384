package c12err4.define.exceptions;

public class TestOwnExceptions {

	public static void main(String[] args) {

		System.out.println("Kalder throwMyCheckedException");
		try {
			throwMyCheckedException();
		} catch (MyCheckedException e) {
			System.out.println("Greb en MyCheckedException");
		}

		try {
			System.out.println("Kalder throwMyUncheckedException i try...catch");
			throwMyUncheckedException();
		} catch (MyUncheckedException e) {
			System.out.println("Greb en MyUncheckedException");
		}

		System.out.println("Kalder throwMyUncheckedException uden try...catch");
		throwMyUncheckedException();
	}

	public static void throwMyCheckedException() throws MyCheckedException {
		throw new MyCheckedException();
	}

	public static void throwMyUncheckedException() {
		throw new MyUncheckedException();
	}
}
