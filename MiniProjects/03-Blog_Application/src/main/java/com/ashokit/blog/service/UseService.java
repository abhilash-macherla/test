package com.ashokit.blog.service;

import com.ashokit.blog.binding.LoginForm;
import com.ashokit.blog.binding.SignupForm;

public interface UseService {

	public boolean signUp(SignupForm form);
	
	public String login(LoginForm form);
}
