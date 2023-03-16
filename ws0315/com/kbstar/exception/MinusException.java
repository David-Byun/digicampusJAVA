package com.kbstar.exception;

public class MinusException extends RuntimeException {

    public MinusException(String message) {
        super(message);
    }

    public MinusException(String message, Throwable cause) {
        super(message, cause);
    }
}
