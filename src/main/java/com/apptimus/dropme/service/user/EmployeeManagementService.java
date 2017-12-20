package com.apptimus.dropme.service.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.apptimus.dropme.entities.Employee;
import com.apptimus.dropme.entities.User;
import com.apptimus.dropme.others.GenericResult;

/**
 * @author M.Vithusanth
 * @CreatedOn 19th December 2017
 * @Purpose Services for Add/Edit/Delete/View Single/View All Users
 */
public class EmployeeManagementService {
	
	//Add employees method
	public GenericResult addUser(User newUser){
		//code to add emp
		return new GenericResult(true, "", "");
	}
	
	//View employees method
	public GenericResult viewUser() {
		String sql="SELECT * FROM employee";
		return new GenericResult(true,"","");
	}
}
