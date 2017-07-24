package com.eisgroup.cb.exceptions;

/**
 * Created by Titarenko on 18.06.2017 at 12:13.
 */
public class PasswordDuplicateException extends Exception {
    public PasswordDuplicateException(String message) {
        super(message);
    }
}
