package org.onekin.authentication;

import org.junit.Before;
import org.junit.Test;

import org.onekin.authentication.AuthenticationServiceInterface;
import org.onekin.authentication.AuthenticationServiceOAuth;
import org.onekin.authentication.InvalidCredentialsException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 */
public class AuthenticationServiceOpenIDTest
{
    private AuthenticationServiceInterface authenticationService;

    @Before
    public void setUp()
    {
        this.authenticationService = new AuthenticationServiceOAuth();
    }

    @Test
    public void successfulLogin()
    {
        try {
            assertTrue(this.authenticationService.authenticate("user", "password"));
        } catch(InvalidCredentialsException e) {
            fail();
        }
    }

    @Test
    public void unsuccessfulLogin()
    {
        try {
            this.authenticationService.authenticate("User", "Password");
        } catch(InvalidCredentialsException e) {
            assertTrue(true);
        }
    }
}
