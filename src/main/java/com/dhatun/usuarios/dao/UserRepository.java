package com.dhatun.usuarios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhatun.usuarios.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	@SuppressWarnings("unchecked")
	User save(User user);
	
}
