/**
 * 
 */
package com.practice.spring.boot.dto;

/**
 * @author JJPL278
 *
 */

public class GreetingsDTO {

	private final long id;
	private String content;

	public GreetingsDTO(long pId, String pContent) {
		this.id = pId;
		this.content = pContent;
	}

	public long getId() {
		return id;
	}


	public String getContent() {
		return content;
	}
}
