package Exceptions;

public class MovieException extends RuntimeException {
    public MovieException() {
    }

    public MovieException(String message) {
        super(message);
    }
}
