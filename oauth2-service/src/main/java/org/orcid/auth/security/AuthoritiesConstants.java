package org.orcid.auth.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";
    
    public static final String CONSORTIUM_LEAD = "CONSORTIUM_LEAD";    
    
    public static final String MEMBER = "MEMBER";

    private AuthoritiesConstants() {
    }
}