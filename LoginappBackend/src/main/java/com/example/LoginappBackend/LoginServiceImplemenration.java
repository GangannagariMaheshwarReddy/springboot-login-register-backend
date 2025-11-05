package com.example.LoginappBackend;

import org.springframework.stereotype.Component;

@Component
public class LoginServiceImplemenration implements LoginService{
	
	LoginRepositry loginRepository;
	

	public LoginServiceImplemenration(LoginRepositry loginRepository) {
		super();
		this.loginRepository = loginRepository;
	}


	@Override
	public boolean validateUser(String username, String password) {
		
		User user = loginRepository.findByUsername(username);
		
		if(user == null) {
			return false;
		}
		
		else {
			if(user.password.equals(password)) {
				return true;
			}
			return false;
		}
	}

}
