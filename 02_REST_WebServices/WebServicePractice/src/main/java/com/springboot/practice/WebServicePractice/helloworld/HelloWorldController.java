/**
 * 
 */
package com.springboot.practice.WebServicePractice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Velmurugan Moorthy
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String displayHelloWorld() {
		return "Hola Amigo!!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean fetchHelloWorldBean() {
		return new HelloWorldBean("Hola Amigo!!!");
	}
	
	@GetMapping(path="/hello-world-bean/{name}")
	public HelloWorldBean displayHelloWorldWithName(@PathVariable String name) {
	
		return new HelloWorldBean(name);
	}
	
}
