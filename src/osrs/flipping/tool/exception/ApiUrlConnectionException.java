package osrs.flipping.tool.exception;

public class ApiUrlConnectionException extends RuntimeException {
    public ApiUrlConnectionException(String msg) {
        super(msg);
    }

    public ApiUrlConnectionException(String msg, Exception e) {
        super(msg, e);
    }
}
