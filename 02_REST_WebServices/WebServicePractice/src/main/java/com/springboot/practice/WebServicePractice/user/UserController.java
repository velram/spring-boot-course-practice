/**
 * 
 */
package com.springboot.practice.WebServicePractice.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping(path="/create-user")
	public void createUser(@RequestBody User inputUser) {
		if(null != inputUser) {
			userService.createUser(inputUser);
		}
	}
	
	
}
