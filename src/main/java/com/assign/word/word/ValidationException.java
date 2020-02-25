package com.assign.word.word;

public class ValidationException extends RuntimeException {
    /**
     * Constructs an instance of <code>ValidationException</code>.
     */
    public ValidationException() {
        super();
    }

    /**
     * Constructs an instance of <code>ValidationException</code> with
     * the specified detail message.
     *
     * @param message The detail message.
     */
    public ValidationException(String message) {
        super(message);
    }
}
