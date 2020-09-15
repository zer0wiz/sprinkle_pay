package com.example.kakaopay.sprinkle_pay.exception.token;

public class InvalidTokenExcetion extends IllegalArgumentException {
    public InvalidTokenExcetion() {
        super("Validation failed");
    }

    public InvalidTokenExcetion(final String s) {
        super(s);
    }

    public InvalidTokenExcetion(final String message, final Throwable cause) {
        super(message, cause);
    }

    public InvalidTokenExcetion(final Throwable cause) {
        super(cause);
    }
}
