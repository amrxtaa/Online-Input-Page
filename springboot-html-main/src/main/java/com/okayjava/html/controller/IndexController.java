package com.okayjava.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.okayjava.html.model.User;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	// register request was posted there and it will be get here , model is a springboot classs which will
	// contain the below feilds and then will be sent ti the welcome.html page as it returned over herer.
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		// validate 
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getDob());
		System.out.println(user.getEmail());
		System.out.println(user.getPasswd());
		System.out.println(user.getPasswd());
		model.addAttribute("firstname", user.getFname());
		model.addAttribute("lastname", user.getLname());
		model.addAttribute("pass", user.getPasswd());
		return "welcome";
	}
}
