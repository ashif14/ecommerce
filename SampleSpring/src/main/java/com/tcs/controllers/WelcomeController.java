package com.tcs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping({"/","/home"})
	public String home(){
		return "home";
	}
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcome";
	}
}