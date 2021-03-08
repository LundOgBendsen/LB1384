package lab20.fejl5.handling.exceptions;

public class MyUncheckedException extends RuntimeException {

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
