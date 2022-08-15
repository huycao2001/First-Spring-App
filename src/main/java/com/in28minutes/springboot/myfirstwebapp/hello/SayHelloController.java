package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody // Convert object to JSON
	public String sayHello() {
		
		return "Hello mate";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb = new StringBuffer();
		
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>HTML page for Spring</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first page for spring");
		sb.append("</body>");    
		sb.append("</html>");
		
		return sb.toString();

		
	}
	
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody // Convert object to JSON
	public String sayHelloJSP() {
		
		return "sayHello";
	}
}
