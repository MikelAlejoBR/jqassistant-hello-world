package org.onekin.authentication;

import java.lang.Exception;

public class InvalidCredentialsException extends Exception
{
    private static final long serialVersionUID = 8218736412672L;

    public InvalidCredentialsException(String message)
    {
        super(message);
    }
}
