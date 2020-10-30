package com.photoapp.api.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.photoapp.api.user.shared.UserDto;

public interface UsersService extends UserDetailsService{

	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	
}
