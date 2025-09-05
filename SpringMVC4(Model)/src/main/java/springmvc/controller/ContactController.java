package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import springmvc.model.User;


@Controller
public class ContactController {
	
	@RequestMapping("/")
	public String home(Model model)
	{
		System.out.println("Contact from Active");
		model.addAttribute("Header","Ankit anand");
		model.addAttribute("desc","Contact from");
		return "Contact";
	}
	
	
	@RequestMapping("/index")
	public String model()
	{
		System.out.println("index from Active");
		return "index";
	}

	

	/*  first way 
	@RequestMapping(path="/processfrom", method=RequestMethod.POST)
	public String handle(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("password")String password,Model model)
	{
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
			
		
		// Model Attribute
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		System.out.println(user);
		
		model.addAttribute("user" + user);
		
		return "success";
	}
	
	*/
	
	
	// 2nd way
	@RequestMapping(path="/processfrom", method=RequestMethod.POST)
	public String handle(@ModelAttribute User user,Model model)
	{
		
		System.out.println(user);
		
		model.addAttribute("user" + user);
		
		return "success";
	}

}
