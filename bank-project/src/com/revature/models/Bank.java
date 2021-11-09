package com.revature.models;

import java.util.ArrayList;

public class Bank {
    // name
    private String name;
    
    // address
    private String address;
    
    // list of customers
    private ArrayList<Person> persons;
    
    // reject invalid transactions
    private boolean rejectTrans;
    
    // list of accounts
    private ArrayList<Account> accounts;
    
    // constructor
    public Bank (String name, String address) {
    	this.name = name;
    	this.address = address;
    }
    
    // getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void addPerson(Person person) {
		this.persons.add(person);
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}

	public boolean isRejectTrans() {
		return rejectTrans;
	}

	public void setRejectTrans(boolean rejectTrans) {
		this.rejectTrans = rejectTrans;
	}
    
}
