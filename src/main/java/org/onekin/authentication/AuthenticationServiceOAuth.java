package org.onekin.authentication;

import org.onekin.authentication.AuthenticationServiceInterface;
import org.onekin.authentication.InvalidCredentialsException;

/**
 * Provides plain authentication
 */
class AuthenticationServiceOAuth implements AuthenticationServiceInterface
{
    /**
     * {@inheritDoc}
     */
    public boolean authenticate(String username, String password) throws InvalidCredentialsException
    {
        // send request to OAuth server, receive and process it. The below code
        // mocks the OAuth server

        if (username.equals("user") && password.equals("password")) {
            return true;
        } else {
            throw new InvalidCredentialsException("The provided username or password are invalid");
        }
    }
}
