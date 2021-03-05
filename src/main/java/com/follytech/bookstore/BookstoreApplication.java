package com.follytech.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

import com.follytech.bookstore.domain.User;
import com.follytech.bookstore.security.Role;
import com.follytech.bookstore.security.UserRole;
import com.follytech.bookstore.service.UserService;
import com.follytech.bookstore.utility.SecurityUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {

		User user1 = new User();
		user1.setFirstname("Carlo");
		user1.setLastname("Davilla");
		user1.setUsername("Dev");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("123456789"));
		user1.setEmail("carlogbossou.developpeur@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);


	}

}
