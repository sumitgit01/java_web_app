package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//handler method
	@RequestMapping("/index")
	public String home()
	{
		System.out.println("this is home handler");
		return "index";
	}

}
