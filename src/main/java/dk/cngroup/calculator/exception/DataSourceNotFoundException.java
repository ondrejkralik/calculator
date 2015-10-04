package dk.cngroup.calculator.exception;

/**
 * This exception is thrown when DataSource is not found.
 */
public class DataSourceNotFoundException extends Exception {

    public DataSourceNotFoundException(String message) {
        super(message);
    }
}
