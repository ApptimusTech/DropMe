package com.apptimus.dropme.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apptimus.dropme.entities.User;
import com.apptimus.dropme.others.GenericResult;
import com.apptimus.dropme.others.JsonFormer;
import com.apptimus.dropme.others.ValueValidator;
import com.apptimus.dropme.service.user.EmployeeManagementService;
import com.apptimus.dropme.session.AuthorityConstant;
import com.apptimus.dropme.session.CurrentUser;
import com.apptimus.dropme.session.TokenManager;

public class EmployeeManagementController {
	@Autowired
	EmployeeManagementService emService;
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("token") String token)
	{
		CurrentUser currentUser = TokenManager.validateToken(token);
		if(currentUser.getAuthorityMap().get(AuthorityConstant.AUTH_ADD_CUSTOMER) != null)
		{
			GenericResult result = new GenericResult(true, "", "");
			User addedUser = new User();
			
			//Name
			result = ValueValidator.validateText(name, "Name");
			if(result.isStatus())
				addedUser.setName(name);
			else
				return JsonFormer.form(result);
			
			//Email
			result = ValueValidator.validateText(email, "Email");
			if(result.isStatus())
				addedUser.setEmail(email);
			else
				return JsonFormer.form(result);
			
			return JsonFormer.form(emService.addUser(addedUser));
		}
		return JsonFormer.form(new GenericResult(false, "You have no authority", ""));
	}
}
