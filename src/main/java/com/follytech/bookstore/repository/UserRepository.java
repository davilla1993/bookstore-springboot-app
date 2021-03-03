package com.follytech.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.follytech.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByUsername(String username);

}
