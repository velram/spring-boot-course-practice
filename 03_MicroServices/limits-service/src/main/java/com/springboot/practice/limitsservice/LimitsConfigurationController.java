/**
 * 
 */
package com.springboot.practice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.limitsservice.bean.LimitConfigurationBean;

/**
 * @author velmurugan.moorthy
 *
 */
@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitConfiguration limitConfiguration;

	@GetMapping("/limits")
	public LimitConfigurationBean getLimitsFromConfiguration() {

		return new LimitConfigurationBean(limitConfiguration.getMaximum(),
				limitConfiguration.getMinimum());
	}
}
