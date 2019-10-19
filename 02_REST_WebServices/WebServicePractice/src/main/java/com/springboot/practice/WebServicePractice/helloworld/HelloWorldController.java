/**
 * 
 */
package com.springboot.practice.WebServicePractice.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @author Velmurugan Moorthy
 *
 */
@RestController
public class HelloWorldController {

	private static final String HELLO_WORLD_KEY = "hello.world.message";
	@Autowired
	private MessageSource messageSource;

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

	//Old approach to get locale from RequestHeader
	// This approach is not recommended for real-time use
	@GetMapping(path="/hello-world-internationalized")
	public String displayInternationalizedHelloWorld(
			@RequestHeader(name="Accept-Language", required = false) Locale inputLocale
	){

		return messageSource.getMessage(HELLO_WORLD_KEY, null, inputLocale);
	}

	/*
	  New approach to get locale.
	 */
	@GetMapping(path="/hello-world-internationalized-updated")
	public String renderInternationalizedMessage(){
		return messageSource.getMessage(HELLO_WORLD_KEY, null,
				LocaleContextHolder.getLocale());
	}
	
}
