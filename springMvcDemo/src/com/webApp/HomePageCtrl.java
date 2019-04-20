package com.webApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageCtrl {
	@RequestMapping("/")
	public String callHomePage() {
		System.out.println("in home page");
		return "homePage";
	}
	
}
