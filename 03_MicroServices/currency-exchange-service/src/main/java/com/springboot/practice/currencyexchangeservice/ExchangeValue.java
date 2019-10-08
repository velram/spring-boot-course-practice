/**
 * 
 */
package com.springboot.practice.currencyexchangeservice;

import java.math.BigDecimal;


/**
 * @author Velmurugan
 * 
 */

public class ExchangeValue {
  
	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
	
	public ExchangeValue(long pId, String pFrom, String pTo, BigDecimal pConversionMultiple) {
		
		super();
		this.id = pId;
		this.from = pFrom;
		this.to = pTo;
		this.conversionMultiple = pConversionMultiple;
		
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
