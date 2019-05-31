package org.onekin.authentication;

import org.onekin.authentication.AuthenticationServiceInterface;
import org.onekin.authentication.InvalidCredentialsException;

/**
 * Provides plain authentication
 */
public class AuthenticationServiceWebSocket implements AuthenticationServiceInterface
{
    /**
     * {@inheritDoc}
     */
    public boolean authenticate(String username, String password) throws InvalidCredentialsException
    {
        // stablishes connection to a web socket and tries authenticating.
        // the below code mocks that behavior

        if (username.equals("user") && password.equals("password")) {
            return true;
        } else {
            throw new InvalidCredentialsException("The provided username or password are invalid");
        }
    }
}
