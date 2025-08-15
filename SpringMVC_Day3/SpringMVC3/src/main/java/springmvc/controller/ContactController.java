package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class ContactController {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Contact from Active");
		return "Contact";
	}
	
	/*
	 * purana trika jo servlet main use hota hai 
	 * 
	 * 
	@RequestMapping(path="/processfrom", method=RequestMethod.POST)
	public String handle(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String Password = request.getParameter("password");
		
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Password: " + Password);
		
		
		return " ";
	}
	*/
	
	@RequestMapping(path="/processfrom", method=RequestMethod.POST)
	public String handle(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("password")String password,Model model)
	{
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		
		
		  model.addAttribute("name",name);
		  model.addAttribute("email",email);
		  model.addAttribute("password",password);
		  
		  
		
		
		return "success";
	}

}
