/**
 * 
 */
package com.practice.spring.boot.springbootpractice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.boot.dto.GreetingsDTO;

/**
 * @author Velmurugan Moorthy
 * 27.05.2019 
 * Testing basic REST controller
 *
 */
@RestController
public class GreetingsController {

	private final AtomicLong counter = new AtomicLong();
	private final String greetingTemplate = "Hello, %s!";
	
	 @RequestMapping("/greeting")
	 public GreetingsDTO getGreetings(@RequestParam(value="name", defaultValue="world") String name) {
		 return new GreetingsDTO(counter.incrementAndGet(),String.format(greetingTemplate, name));
		 
	}
	
}
