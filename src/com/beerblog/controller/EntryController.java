package com.beerblog.controller;

import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beerblog.entity.BlogEntry;
import com.beerblog.entity.User;
import com.beerblog.service.EntryService;
import com.beerblog.service.TagService;

@Controller
public class EntryController {

	@Autowired
	private EntryService entryService;
	
	@Autowired
	private TagService tagService;
	
	@ModelAttribute("entry") // <form:form commandName="entry">
	public BlogEntry construct(){
		return new BlogEntry();
	}
	
	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage(Model model) {

		String message = "<div align='center'>"
				+ "<h3>********** Beer Blog **********</h3>"
				+ "This message is comming from BlogMapping.java";
		
		// testing for reverse - newest on top
		//model.addAttribute("entries", entryService.findAll());
		model.addAttribute("entries", entryService.findAllReversed());
	
		//test tags
		model.addAttribute("tags", tagService.findAll());
		
		return new ModelAndView("welcome", "message", message);
	}
	
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String doSubmitEntry(@ModelAttribute("entry") BlogEntry entry){
		entry.setPublishedDate(new Date());
		entryService.save(entry);
		//Collections.reverse((List<?>) entry);
		return "redirect:/welcome.html"; 
	}
	
}
