package com.beerblog.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
* author: Crunchify.com
*/
 
@Controller
public class BeerBlogHello {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div align='center'>"
				+ "<h3>********** Hello World, Beer Blog ON THE WAY</h3>This message is comming from BeerBlogHello.java **********<br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	/*
	@RequestMapping("/indeksownia")
	public String indeksownia(){
		return "/WEB-INF/jsp/jakas-strona.jsp";
	}
	*/
	
} // END OF CLASS

// source
// http://crunchify.com/simplest-spring-mvc-hello-world-example-tutorial-spring-model-view-controller-tips/
// http://localhost:8080/CrunchifySpringMVCTutorial/


// Tutorial na zrobienie Bloga z logowaniem, dodawaniem wpisów, dupsy w Javie, Spring Jquery i inne
// Koles z Czech
// https://www.youtube.com/watch?v=mH2jx2RCu7o
// !!

// changing the root for localhost/beer-blog-hiccup
// http://stackoverflow.com/questions/2437465/java-how-to-change-context-root-of-a-dynamic-web-project-in-eclipse