package com.follytech.bookstore.service;

import com.follytech.bookstore.domain.User;
import com.follytech.bookstore.security.PasswordResetToken;

public interface UserService {

    PasswordResetToken getPasswordResetToken(final String token);


    void createPasswordResetTokenForUser(final User user, final String token);
    
}
