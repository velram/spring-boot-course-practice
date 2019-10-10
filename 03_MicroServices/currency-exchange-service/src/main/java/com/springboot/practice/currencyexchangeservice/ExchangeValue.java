/**
 * 
 */
package com.springboot.practice.currencyexchangeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


/**
 * @author Velmurugan
 * 
 */

@Entity
public class ExchangeValue {

	@Id
	private long id;

	@Column(name = "exchange_from")
	private String from;

	@Column(name="exchange_to")
	private String to;

	private BigDecimal conversionMultiple;
	private int port;


	/**
	 * Default constructor
	 */
	public ExchangeValue(){

	}
	
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
