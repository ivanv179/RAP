package com.revature.models;

public class Employee extends Person{
    // approve or reject account
    private boolean actStatus;
    
    // view bank accounts
    private boolean viewAccount;
    
    // constructor
	public Employee(String firstName, String lastName, String username, String password) {
		super(firstName, lastName, username, password);
	}
	
	// getters and setters
	public boolean isActStatus() {
		return actStatus;
	}

	public void setActStatus(boolean actStatus) {
		this.actStatus = actStatus;
	}

	public boolean isViewAccount() {
		return viewAccount;
	}

	public void setViewAccount(boolean viewAccount) {
		this.viewAccount = viewAccount;
	}
	
}
