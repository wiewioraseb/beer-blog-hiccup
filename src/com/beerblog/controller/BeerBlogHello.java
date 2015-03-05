package com.beerblog.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class BeerBlogHello {

	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div align='center'>"
				+ "<h3>********** Hello World, Beer Blog ON THE WAY</h3>This message is comming from BeerBlogHello.java **********<br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	

	
	
	// This shows indeksownia.html in web browser (from indeksownia.jsp)
	@RequestMapping("/indeksownia.html")
	public String indeksownia(){
		return "indeksownia"; // /WEB-INF/jsp/indeksownia
	}
	
	@RequestMapping("/index.html")
	public String index(){
		return "index"; // W pliku xml general jest tag
	}
	
	@RequestMapping("/bonus.html")
	public String bonus(){
		return "bonus"; 
	}
	
	
} // END OF CLASS

// !!!!
// HERE: http://www.mkyong.com/spring/spring-error-classnotfoundexception-org-springframework-web-context-contextloaderlistener/
// http://stackoverflow.com/questions/15989325/severe-error-configuring-application-listener-of-class-org-springframework-web

// source
// http://crunchify.com/simplest-spring-mvc-hello-world-example-tutorial-spring-model-view-controller-tips/
// http://localhost:8080/CrunchifySpringMVCTutorial/
// http://localhost:8080/beer-blog-hiccup/


// Tutorial na zrobienie Bloga z logowaniem, dodawaniem wpisów, dupsy w Javie, Spring Jquery i inne
// Koles z Czech
// https://www.youtube.com/watch?v=mH2jx2RCu7o
// !!

// changing the root for localhost/beer-blog-hiccup
// http://stackoverflow.com/questions/2437465/java-how-to-change-context-root-of-a-dynamic-web-project-in-eclipse



// http://stackoverflow.com/questions/28783419/adding-resources-to-tomcat-server-makes-this-resource-posses-tag-in-parenthesis

// Podstawy Spring MVC
// http://www.deepakgaikwad.net/index.php/2009/03/31/spring-mvc-tutorial-concepts-and-code-examples.html