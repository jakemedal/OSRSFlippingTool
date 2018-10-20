package osrs.flipping.tool.exception;

public class ApiUrlCreationException extends RuntimeException {
    public ApiUrlCreationException(String msg) {
        super(msg);
    }

    public ApiUrlCreationException(String msg, Exception e) {
        super(msg, e);
    }
}
