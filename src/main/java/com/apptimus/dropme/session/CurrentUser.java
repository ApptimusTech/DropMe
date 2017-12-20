package com.apptimus.dropme.session;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.apptimus.dropme.entities.User;

/**
 * @author M.Vithusanth
 * @CreatedOn 20th December 2017
 * @Purpose Holds the information about the current user
 */
public class CurrentUser {
	private User user;
	private String token;
	private Date tokenExpiryDate;
	private Map<String, Boolean> authorityMap = new HashMap<String, Boolean>();

	// *************************************************************
	// ** CONSTRUCTORS
	// *************************************************************

	// *************************************************************
	// ** GETTERS AND SETTERS
	// *************************************************************
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTokenExpiryDate() {
		return tokenExpiryDate;
	}

	public void setTokenExpiryDate(Date tokenExpiryDate) {
		this.tokenExpiryDate = tokenExpiryDate;
	}

	public Map<String, Boolean> getAuthorityMap() {
		return authorityMap;
	}

	public void setAuthorityMap(Map<String, Boolean> authorityMap) {
		this.authorityMap = authorityMap;
	}
}
