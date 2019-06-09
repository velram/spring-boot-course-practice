/**
 * 
 */
package com.springboot.practice.WebServicePractice.user;

import org.springframework.stereotype.Component;

/**
 * @author Velmurugan
 *
 */
@Component
public class User {

	private String id;
	private String name;
	private String department;
	
	/**
	 * @param id
	 * @param name
	 * @param department
	 */
	public User(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
