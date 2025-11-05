package com.example.LoginappBackend;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class LoginController {
	
	LoginService loginService;
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@PostMapping("/login")
	public Map<String, String> userLogin(@RequestBody Map<String, String> data) {
		
		String username = data.get("username");
		String password = data.get("password");
		
		boolean result = loginService.validateUser(username, password);
		
		Map<String, String> response = new HashMap<String, String>();
		if(result == false) {
			response.put("Error", "Invalid Username or Password");
		}
		else {
			response.put("success", "Login Successful");
			response.put("username", username);
		}
		return response;
	}
}
