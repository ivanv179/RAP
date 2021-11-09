package com.revature.models;

import java.util.*;

public class Account {
    //type
    private String actType;

	// balance
    private long balance;
    
    // withdrawal
    private boolean withdrawal;
    
    // deposit
    private boolean deposit;
    
    // transfer
    private boolean transfer;
    
    // transactions
    private ArrayList<Transaction> transactions;
    
    // constructor
    public Account (String actType) {
    	this.actType = actType;
    }
    
    // getters and setters 
    public String getActType() {
		return actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setWithdrawl(boolean withdrawal) {
		this.withdrawal = withdrawal;
	}

	public void setDeposit(boolean deposit) {
		this.deposit = deposit;
	}

	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
}
