/**
 * 
 */
package com.springboot.practice.WebServicePractice.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author JJPL278
 *
 */

@Component
public class UserDAOService {

	private static List<User> users = new ArrayList<>();
	
	
	static {
		users.add(new User("1","Velmurugan","CSE"));
		users.add(new User("2","Radhakrishnan","IT"));
		users.add(new User("3","Munna","ECE"));
	}
	
	//GET /users
	public List<User> findAll(){
		return users;
	}
	
	//GET /users{id}
	public User findUser(String id) {
		
		for(User currentUser : users) {
			if(currentUser.getId().equals(id)) {
				return currentUser;
			}
		}
		return null;
	}
	
}