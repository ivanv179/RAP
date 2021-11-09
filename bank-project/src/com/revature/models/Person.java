package com.revature.models;

public class Person {
    // first name
    private String firstName;
    
    // last name
    private String lastName;
    
    // username
    private String username;
    
    // password
    private String password;
    
    // ID
    private int id;
    
    // constructors
    public Person(String firstName, String lastName, String username, String password) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.username = username;
    	this.password = password;
    }
    
    // getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    
}
