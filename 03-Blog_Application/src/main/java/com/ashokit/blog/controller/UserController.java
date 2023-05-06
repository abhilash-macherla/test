package com.ashokit.blog.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.blog.binding.LoginForm;
import com.ashokit.blog.binding.SignupForm;
import com.ashokit.blog.service.UseService;

@Controller
public class UserController {

	@Autowired
	private UseService userSerRepo;

	@GetMapping("/")
	public String loadIndexPage() {
		return "index";
	}

	@GetMapping("/signup")
	public String loadSignupForm(Model model) {
		model.addAttribute("signupformdata", new SignupForm());
		return "signup";
	}

	@PostMapping("/signup")
	public String getSignupFormData(@ModelAttribute("signupformdata") SignupForm signupformdata, Model model) {
		System.out.println(signupformdata);

		boolean status = userSerRepo.signUp(signupformdata);
		if (status) {
			model.addAttribute("successMessage", "Account Created Successfully");
		} else {
			model.addAttribute("errorMessage", "Problem Occured");
		}
		return "signup";
	}

	@GetMapping("/login")
	public String loadLoginPage(Model model) {
		
		model.addAttribute("logindata", new LoginForm());
		return "login";
	}

	@PostMapping("/login")
	public String UserLogin(@ModelAttribute("logindata") LoginForm logindata, Model model) {
		
		System.out.println(logindata);
		String status = userSerRepo.login(logindata);
		if (status.equals("success")) {
			return "redirect:/viewallblog";
		} else {
			model.addAttribute("errorMessage", status);
		}
		
		return "login";
	}

	@GetMapping("/viewallblog")
	public String viewBlog() {
		return "viewblog";
	}
}
