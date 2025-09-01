package JavaRevision.ExceptionHandling;

public class InvalidUserException extends Exception{
    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException() {
    }
}
