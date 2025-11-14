package com.example.LoginappBackend;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	
	boolean validateUser(String username, String password);
	int getSalary(String username);
    
    boolean userExists(String username);
    void registerUser(String username, String password, int salary);
}
