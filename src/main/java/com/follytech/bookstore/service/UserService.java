package com.follytech.bookstore.service;

import java.util.Set;

import com.follytech.bookstore.domain.User;
import com.follytech.bookstore.security.PasswordResetToken;
import com.follytech.bookstore.security.UserRole;

public interface UserService {

    public PasswordResetToken getPasswordResetToken(final String token);


    public void createPasswordResetTokenForUser(final User user, final String token);

    public User findByUsername(String username);

    public User findByEmail(String email);

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    
}
