package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.classic.Logger;


@Controller
public class LoginController {
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
	//Model
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage() {

		return "login";
	}
	
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	// The function below acts like the action in php. 
	// when we post the data, the function will redirect to the welcome page. 
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password); 
		return "welcome";
	}
}