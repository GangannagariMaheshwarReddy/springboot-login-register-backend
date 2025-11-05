package com.example.LoginappBackend;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	
	boolean validateUser(String username, String password);
}
