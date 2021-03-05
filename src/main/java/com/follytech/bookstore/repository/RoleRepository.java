package com.follytech.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.follytech.bookstore.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
