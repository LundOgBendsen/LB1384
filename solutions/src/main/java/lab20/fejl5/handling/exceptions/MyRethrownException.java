package lab20.fejl5.handling.exceptions;

public class MyRethrownException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyRethrownException() {
        super();
    }

    public MyRethrownException(String message) {
        super(message);
    }

    public MyRethrownException(Throwable cause) {
        super(cause);
    }

    public MyRethrownException(String message, Throwable cause) {
        super(message, cause);
    }
}
