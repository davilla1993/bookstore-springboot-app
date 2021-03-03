package com.follytech.bookstore.service.impl;

import com.follytech.bookstore.domain.User;
import com.follytech.bookstore.repository.PasswordResetTokenRepository;
import com.follytech.bookstore.security.PasswordResetToken;
import com.follytech.bookstore.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(final String token) {

        return passwordResetTokenRepository.findByToken(token) ;
    }

    @Override
    public void createPasswordResetTokenForUser(User user, final String token) {

        final PasswordResetToken myToken = new PasswordResetToken(token, user);
        passwordResetTokenRepository.save(myToken);
    }

    
    
}
