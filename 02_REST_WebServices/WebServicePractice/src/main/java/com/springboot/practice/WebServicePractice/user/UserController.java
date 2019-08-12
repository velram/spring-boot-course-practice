/**
 * 
 */
package com.springboot.practice.WebServicePractice.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * @author JJPL278
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserDAOService userService;

	// GET /users
	@GetMapping(path = "/find-all-users")
	public List<User> findAllUsers() {
		return userService.findAll();
	}

	// GET /users{id}
	@GetMapping(path = "/find-user/{userId}")
	public User findUser(@PathVariable int userId) {
		return userService.findUser(userId);
	}
	
	//@PostMapping(path="/create-user")
	@PostMapping(path="/create-user")
	public ResponseEntity<Object> createUser(@RequestBody User inputUser) {
		 URI createdUserURI = null;
		if(null != inputUser) {
		 User createdUser =	userService.createUser(inputUser);
		 createdUserURI = ServletUriComponentsBuilder
		 .fromCurrentRequest()
		 .path("/{id}")
		 .buildAndExpand(createdUser.getId()).toUri();
		}
		return ResponseEntity.created(createdUserURI).build();
	}
	
	//TODO - Delete user
	
}
