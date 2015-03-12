package com.beerblog.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beerblog.entity.User;
import com.beerblog.service.UserService;
import com.beerblog.service.ItemService;



@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/users.html")
	public String users(Model model){
		// loading date from date base
	
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
	
	
}
