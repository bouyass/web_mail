package com.lyes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lyes.model.User;
import com.lyes.services.LoadEmails;
import com.lyes.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired 
	@Qualifier("fileLoader")
	private LoadEmails loader;
	

	
	@GetMapping({"/","/welcome"})
	public String welcome(Model model) throws Exception {
		System.out.println("user service initialization");
		model.addAttribute("emails", loader.loadEmails("karim"));
		System.out.println(loader.loadEmails("karim").size());
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
