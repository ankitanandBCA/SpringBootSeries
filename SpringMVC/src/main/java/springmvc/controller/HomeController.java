package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String home()
	{
		System.out.println("index page");
		return "index";
	}

	@RequestMapping("/about")
	public String about()
	{
		System.out.println("about page");
		return"about";
	}
}
