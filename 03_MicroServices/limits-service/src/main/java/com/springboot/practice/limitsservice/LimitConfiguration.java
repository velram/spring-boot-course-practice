/**
 * 
 */
package com.springboot.practice.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author velmurugan.moorthy
 *
 */
@Configuration
@ConfigurationProperties("limit-service")
public class LimitConfiguration {

	private int maximum;
	private int minimum;

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}
