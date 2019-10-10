package com.springboot.practice.currencyconversionservice;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;


public class CurrencyConversionBean {

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedValue;
    private int port;

    public CurrencyConversionBean(long pId, String pFrom, String pTo,
                                  BigDecimal pQuantity, BigDecimal pConversionMultiple,
                                  BigDecimal pTotalCalculatedValue,
                                  int pPort) {
        this.id = pId;
        this.from = pFrom;
        this.to = pTo;
        this.quantity = pQuantity;
        this.conversionMultiple = pConversionMultiple;
        this.totalCalculatedValue = pTotalCalculatedValue;
        this.port = pPort;
    }

    public CurrencyConversionBean(){

    }

    //Getters & Setter section

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedValue() {
        return totalCalculatedValue;
    }

    public void setTotalCalculatedValue(BigDecimal totalCalculatedValue) {
        this.totalCalculatedValue = totalCalculatedValue;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
