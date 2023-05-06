package com.ashokit.blog.serviceimpl;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.blog.binding.LoginForm;
import com.ashokit.blog.binding.SignupForm;
import com.ashokit.blog.entity.User;
import com.ashokit.blog.repository.UserRepository;
import com.ashokit.blog.service.UseService;

	@Service
	public class UserServiceImpl implements UseService {

		@Autowired
		private UserRepository userDetailsRepo;

		
		public boolean signUp(SignupForm form) {

			User entity = new User();
			BeanUtils.copyProperties(form, entity);
			userDetailsRepo.save(entity);
			return true;
		}

		public String login(LoginForm form) {
			User entity = userDetailsRepo.findByEmailAndPassword(form.getEmail(), form.getPassword());
			if (entity == null) {
				return "Invalid Credentials";
			} else {
				return "success";
			}
		}
	}

