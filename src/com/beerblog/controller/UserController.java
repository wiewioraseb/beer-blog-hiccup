package com.beerblog.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beerblog.entity.User;
import com.beerblog.service.UserService;
import com.beerblog.service.ItemService;



@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ItemService itemService;
	
	@ModelAttribute("user") // <form:form commandName="user">
	public User construct(){
		return new User();
	}
	
	@RequestMapping("/users.html")
	public String users(Model model){
		// loading data from database
	
		// testing this
		model.addAttribute("bambucha", itemService.findAll());
		
		model.addAttribute("users", userService.findAll());
		return "users";
	}

	@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id){
		model.addAttribute("user", userService.findOne(id));
		return "user-detail";
	}
	
	// testing in register
	@RequestMapping("/register")
	public String showRegister(Model model){
		
		model.addAttribute("bambucha", itemService.findAll());
		model.addAttribute("users", userService.findAll());
		
		return "user-register";
	}
	
	/* 
	 	@RequestMapping("/register")
	public String showRegister(){
		return "user-register";
	}
	 
	 */
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user){
		userService.save(user);
		return "redirect:/register.html"; 
		//changed from 'user-register' to redirect:/register to achieve proper refreshing
	}
	
}
