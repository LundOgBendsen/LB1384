package c12err4.define.exceptions;

@SuppressWarnings("serial")
public class MyCheckedException extends Exception {

	public MyCheckedException() {
		super();
	}

	public MyCheckedException(String message) {
		super(message);
	}

	public MyCheckedException(Throwable cause) {
		super(cause);
	}

	public MyCheckedException(String message, Throwable cause) {
		super(message, cause);

	}
}
