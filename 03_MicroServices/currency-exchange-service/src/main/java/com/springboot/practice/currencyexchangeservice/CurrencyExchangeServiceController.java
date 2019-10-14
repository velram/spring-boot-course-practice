/**
 * 
 */
package com.springboot.practice.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Velmurugan 
 * 04.10.2019
 * 
 */

@RestController
public class CurrencyExchangeServiceController {
	
	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueRepository exchangeValueRepo;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue fetchExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeValue = exchangeValueRepo.findByFromAndTo(from, to);//new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		//System.out.print("exchangeValue : "+exchangeValue);
		logger.info("exchangeValue : {} ",exchangeValue);
		return exchangeValue;
	}
}
