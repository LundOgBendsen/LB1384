package c12err5.handling.exceptions;

public class MyUncheckedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    public MyUncheckedException() {
        super();
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
