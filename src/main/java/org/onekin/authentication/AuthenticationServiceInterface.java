package org.onekin.authentication;

import org.onekin.authentication.InvalidCredentialsException;

interface AuthenticationServiceInterface
{
    /**
     * Authenticates the user in the system
     * @param username
     * @param password
     * @return
     */
    public boolean authenticate(String username, String password) throws InvalidCredentialsException;
}
