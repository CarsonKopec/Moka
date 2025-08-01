package moka.toml.exception;

public class MissingFieldException extends RuntimeException {
    public MissingFieldException(String fieldPath) {
        super("Missing required field: " + fieldPath);
    }
}
