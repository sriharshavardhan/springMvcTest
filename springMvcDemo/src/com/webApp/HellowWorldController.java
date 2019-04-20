package com.webApp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorldShowForm";
	}
	@RequestMapping("/processForm")
	public String processForm() {
		return "HelloWorldProcessForm";
	}
	@RequestMapping("/processFormv2")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		String theName=request.getParameter("studentName");
		System.out.println("in  processForm v2");
		theName =theName.toUpperCase();
		 String result="yo"+theName;	
		 model.addAttribute("message", result);
		return "HelloWorldProcessForm";
	}
	
	@RequestMapping("/processFormv3")
	public String processFormv3(@RequestParam("studentName") String theName,Model model) {
		
		System.out.println("in  processForm v3");
		theName =theName.toUpperCase();
		 String result="111111111111111"+theName;	
		 model.addAttribute("message", result);
		return "HelloWorldProcessForm";
	}

}
