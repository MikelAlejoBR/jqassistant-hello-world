package org.onekin.authentication;

import org.onekin.authentication.AuthenticationServiceInterface;
import org.onekin.authentication.InvalidCredentialsException;

/**
 * Provides authentication with I
 */
class AuthenticationServiceOAuth implements AuthenticationServiceInterface
{
    /**
     * {@inheritDoc}
     */
    public boolean authenticate(String username, String password) throws InvalidCredentialsException
    {
        if (username.equals("user") && password.equals("password")) {
            return true;
        } else {
            throw new InvalidCredentialsException("The provided username or password are invalid");
        }
    }
}
