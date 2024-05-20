package com.app.service;

import com.app.model.PasswordResetToken;
import org.springframework.stereotype.Service;

@Service
public interface PasswordResetTokenService {

	public PasswordResetToken findByToken(String token);

	public void delete(PasswordResetToken resetToken);

}
