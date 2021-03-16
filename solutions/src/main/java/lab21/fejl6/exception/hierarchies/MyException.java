package lab21.fejl6.exception.hierarchies;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(String message) {
		super(message);
	}

	public MyException(Throwable cause) {
		super(cause);
	}
}
