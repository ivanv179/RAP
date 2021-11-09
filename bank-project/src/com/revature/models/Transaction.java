package com.revature.models;

import java.util.*;

public class Transaction {
    // type
    private String transType;
    
    // date
    private Date date;
    
    // amount
    private long amount;
    
    // transaction number
    private int transNum;
    
    // constructor
    public Transaction (String transType, Date date, long amount) {
    	this.transType = transType;
    	this.date = date;
    	this.amount = amount;
    	transNum++;
    }
    
    // getters and setters
	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
    
    
}
