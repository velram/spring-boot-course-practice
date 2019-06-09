/**
 * 
 */
package com.springboot.practice.WebServicePractice.helloworld;

/**
 * @author JJPL278
 *
 */
public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String pMessage) {
		this.message = pMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
