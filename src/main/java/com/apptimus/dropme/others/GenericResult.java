package com.apptimus.dropme.others;

/**
 * @author M.Vithusanth
 * @CreatedOn 19th December 2017
 * @Purpose Return result definition - to return complex results in methods
 */
public class GenericResult {
	private boolean status;
	private String message;
	private String description;
	
	// *************************************************************
	// ** CONSTRUCTORS
	// *************************************************************
	public GenericResult(boolean status, String message, String description) {
		super();
		this.status = status;
		this.message = message;
		this.description = description;
	}

	public GenericResult() {
		super();
	}

	// *************************************************************
	// ** GETTERS AND SETTERS
	// *************************************************************
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
