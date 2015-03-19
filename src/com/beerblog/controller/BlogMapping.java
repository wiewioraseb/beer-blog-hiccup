package com.beerblog.controller;
 
import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8080/beer-blog-hiccup/
 
@Controller
public class BlogMapping {

	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage(Model model) {

		String message = "<br><div align='center'>"
				+ "<h3>********** Beer Blog **********</h3>"
				+ "This message is comming from BeerBlogHello.java<br><br>";
		
		DateFormat dFormat = DateFormat.getDateTimeInstance();
		String dateAndTime = dFormat.format(new Date());
		model.addAttribute("serverTime", dateAndTime);
		
		return new ModelAndView("welcome", "message", message);
	}
	
	
	// This shows about.html in web browser (from about.jsp)
	@RequestMapping("/about.html")
	public String about(Model model){
		
		DateFormat dFormat = DateFormat.getDateTimeInstance();
		String dateAndTime = dFormat.format(new Date()); //new DateFormat().getDateTimeInstance(DateFormat.LONG, DateFormat)		
		model.addAttribute("serverTime", dateAndTime);
		
		return "about"; // /WEB-INF/jsp/about
	}
	
	/*
	@RequestMapping("/index.html")
	public String index(){
		return "index"; 
	}
	*/
	
	@RequestMapping("/contact.html")
	public String contact(){
		return "contact"; 
	}
	
	
} // END OF CLASS

