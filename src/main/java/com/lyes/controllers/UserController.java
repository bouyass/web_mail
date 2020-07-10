package com.lyes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lyes.model.User;
import com.lyes.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	

	
	@GetMapping({"/","/welcome"})
	public String welcome(Model model) {
		return "welcome";
	}
	

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		
		if(error!=null) {
			model.addAttribute("error","Invalid credentials, please retry");
		}
		
		if(logout != null) {
			model.addAttribute("message","You have been loged out successfully");
		}
		
		return "login";
	}
	
	
	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userForm",new User());
		return "registration";
	}
		
}
