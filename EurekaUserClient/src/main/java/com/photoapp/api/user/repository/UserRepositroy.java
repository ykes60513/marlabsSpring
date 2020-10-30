package com.photoapp.api.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.photoapp.api.user.data.UserEntity;

public interface UserRepositroy extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);

}
