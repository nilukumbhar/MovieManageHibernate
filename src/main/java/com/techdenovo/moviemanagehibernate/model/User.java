package com.techdenovo.moviemanagehibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="USER")
public class User {
	@Id
	@Column(name="ID")
	private Long id;
	@Column()
	private String username;
	@Column(name="USER_PASSWORD")
    private String password;
	@Column(name="NAME")
    private String name;
	@Column(name="USER_EMAILID")
    private String emailId;
	
	public User(String username, String password, String name, String emailId) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.emailId = emailId;
	}
	public User() {
		// TODO Auto-generated constructor stub
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
       
       
	

}
