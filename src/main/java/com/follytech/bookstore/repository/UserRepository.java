package com.follytech.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.follytech.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	public User findByUsername(String username);
	
	public User findByEmail(String email);

}
