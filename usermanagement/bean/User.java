package com.xadmin.usermanagement.bean;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String country;
	
	
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;		
	}//end constructor with no id
	
	public User(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;		
	}//end constructor with all fields
	
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail() {
		this.email = email;
	}
	
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry() {
		this.country = country;
	}

}
