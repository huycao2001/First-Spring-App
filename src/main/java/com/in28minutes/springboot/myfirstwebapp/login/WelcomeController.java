package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.classic.Logger;


@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	//private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
	



	//Model
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", "in28minutes");
		return "welcome";
	}
	
	
//	@RequestMapping(value="login", method = RequestMethod.POST)
//	// The function below acts like the action in php. 
//	// when we post the data, the function will redirect to the welcome page. 
//	// The params name and password are passed to this function from the post request
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		if(authenticationService.authenticate(name, password)) {
//			model.put("name", name);
//			model.put("password", password); 
//			return "welcome";
//		}
//		
//		model.put("errorMessage", "Invalid credentials, please try again.");
//		
//		return "login";
//	}
}