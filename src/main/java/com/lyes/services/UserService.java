package com.lyes.services;

import com.lyes.model.User;

public interface UserService {
	User findByEmail(String email);
}
