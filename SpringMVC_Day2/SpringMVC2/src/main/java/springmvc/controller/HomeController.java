package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String home(Model model)
	
	{
		
		System.out.println("index page");
		model.addAttribute("name","ankit anand");
		model.addAttribute("id",1234);
		List<String> friends=new ArrayList<String>();
		friends.add("aman kumar");
		friends.add("suman kumar");
		friends.add("anurag kumar");
		friends.add("bechan kumar");
		friends.add("rohit kumar");
		
		model.addAttribute("f",friends);
		
		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView about()
	{
		System.out.println("about page");
		// creating model and view
		 
		 ModelAndView modelAndView=new ModelAndView();
		 modelAndView.addObject("name","uttam");
		 modelAndView.addObject("roll",123);
		 
		 LocalDateTime now =LocalDateTime.now();
		 modelAndView.addObject("time",now);
		 
		 
		 modelAndView.setViewName("about");
		 
		 
		 
		return modelAndView;
	}


@RequestMapping("/help")
	public String help(Model model) {
	    model.addAttribute("name", "ankit anand");
	    model.addAttribute("id", 1234);

	    List<Integer> list = new ArrayList<>();
	    list.add(12);
	    list.add(123);
	    list.add(1234);
	    list.add(12345);
	    list.add(123456);

	    model.addAttribute("marks", list);

	    return "help";
	}
	
}



