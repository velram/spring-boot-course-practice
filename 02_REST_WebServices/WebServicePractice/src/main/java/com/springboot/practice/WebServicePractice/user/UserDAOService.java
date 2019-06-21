/**
 * 
 */
package com.springboot.practice.WebServicePractice.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author JJPL278
 *
 */

@Service
public class UserDAOService {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 3; 
	
	static {
		users.add(new User(1,"Velmurugan","CSE"));
		users.add(new User(2,"Radhakrishnan","IT"));
		users.add(new User(3,"Munna","ECE"));
	}
	
	//GET /users
	public List<User> findAll(){
		return users;
	}
	
	//GET /users{id}
	public User findUser(int id) {
		
		for(User currentUser : users) {
			if(currentUser.getId().equals(id)) {
				return currentUser;
			}
		}
		return null;
	}
	
	//CREATE 
	
	public User createUser(User user) {
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
}