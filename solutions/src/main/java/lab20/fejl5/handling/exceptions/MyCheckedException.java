package lab20.fejl5.handling.exceptions;

public class MyCheckedException extends Exception {
	private static final long serialVersionUID = 1L;

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
