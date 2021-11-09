package com.revature.models;


public class Customer extends Person{
    // view balance
    private boolean viewBalance;
    
    // withdraw or deposit
    private boolean createTransaction;
    
    // register for an account
    private boolean registerAcct;
    
    // transfer money 
    private boolean transferMoney;
    
    // accept transfers
    private boolean acceptTransfer;
    
    //constructor
    public Customer (String firstName, String lastName, String username, String password) {
		super(firstName, lastName, username, password);
	}
    
    // getters and setters
	public boolean isViewBalance() {
		return viewBalance;
	}

	public void setViewBalance(boolean viewBalance) {
		this.viewBalance = viewBalance;
	}

	public boolean isCreateTransaction() {
		return createTransaction;
	}

	public void setCreateTransaction(boolean createTransaction) {
		this.createTransaction = createTransaction;
	}

	public boolean isRegisterAcct() {
		return registerAcct;
	}

	public void setRegisterAcct(boolean registerAcct) {
		this.registerAcct = registerAcct;
	}

	public boolean isTransferMoney() {
		return transferMoney;
	}

	public void setTransferMoney(boolean transferMoney) {
		this.transferMoney = transferMoney;
	}

	public boolean isAcceptTransfer() {
		return acceptTransfer;
	}

	public void setAcceptTransfer(boolean acceptTransfer) {
		this.acceptTransfer = acceptTransfer;
	}
    
    
    
}
