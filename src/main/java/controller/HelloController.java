package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(ModelMap model)
	{
		model.addAttribute("modelMessage","index: Hello World ! - from Spring MVC");
		return "hello";		
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeMethod()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("modelMessage","welcome: Hello World ! - from Spring MVC");
		
		return model;
	}
}
