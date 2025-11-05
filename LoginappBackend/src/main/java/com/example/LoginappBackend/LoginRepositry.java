package com.example.LoginappBackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositry extends JpaRepository<User, Integer> {
	User findByUsername(String Username);
}
