package com.apptimus.dropme.entities;

import java.util.Date;

/**
 * @author M.Vithusanth
 * @CreatedOn 19th December 2017
 * @Purpose User Entity Class
 */
public class Employee 
{
	private Integer id;
	private User user;
	private Date dob;
	private String nic;
	
	//*************************************************************
	//** CONSTRUCTORS
	//*************************************************************
	

	//*************************************************************
	//** GETTERS AND SETTERS
	//*************************************************************
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}
}
