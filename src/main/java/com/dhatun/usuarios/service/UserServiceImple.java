package com.dhatun.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhatun.usuarios.dao.UserRepository;
import com.dhatun.usuarios.model.User;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user)
	{
		return this.userRepository.save(user);
	}
	
}
