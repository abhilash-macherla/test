package com.ashokit.studentenquiry.services;

import com.ashokit.studentenquiry.binding.LoginForm;
import com.ashokit.studentenquiry.binding.SignupForm;
import com.ashokit.studentenquiry.binding.UnlockForm;

public interface UserService {

	
	
	public String unlockAccount(UnlockForm form);
	
	public String resetPassword(String email);
	
	public String loginUser(LoginForm form);

	public boolean getSignUpForm(SignupForm form);

}
