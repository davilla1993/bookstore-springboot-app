package com.follytech.bookstore.repository;

import java.util.Date;
import java.util.stream.Stream;

import com.follytech.bookstore.domain.User;
import com.follytech.bookstore.security.PasswordResetToken;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

    PasswordResetToken findByToken(String token);

    PasswordResetToken findByUser(User user);

    Stream<PasswordResetToken> findAllByExpiryDateLessThan(Date now);

    @Modifying
    @Query("DELETE FROM PasswordResetToken t WHERE t.expiryDate <= ?1")
    void deleteAllExpiredSince(Date now);
}
