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


// http://localhost:8080/beer-blog-hiccup/


// Tutorial na zrobienie Bloga z logowaniem, dodawaniem wpis�w, dupsy w Javie, Spring Jquery i inne
// Koles z Czech
// https://www.youtube.com/watch?v=mH2jx2RCu7o
// !!

// save something to data base - czech
// https://www.youtube.com/watch?v=zRJSoPyKE48&list=PLmcxdcWPhFqMq2BctGktOcIJKUw23wJeh&index=46

// >>>>>>>>>>> <<<<<<<<<<<<<<<<<<
 /// >>>>> http://www.journaldev.com/2433/spring-mvc-tutorial-for-beginners-with-spring-tool-suite <<<<<<<<<<<<

// handling form
// http://www.mkyong.com/spring-mvc/spring-mvc-form-handling-example/ 
// http://www.tutorialspoint.com/spring/spring_mvc_form_handling_example.htm  <--- ?

// saving information to hibernate after pressing submit
// https://www.youtube.com/watch?v=f685FQv2PzA

// Podstawy Spring MVC
// http://www.deepakgaikwad.net/index.php/2009/03/31/spring-mvc-tutorial-concepts-and-code-examples.html