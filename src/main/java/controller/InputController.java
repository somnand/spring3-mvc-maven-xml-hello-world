package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputController {

	@RequestMapping("/values/{country}/{userName}")
	public ModelAndView getValues(@PathVariable Map<String,String> pathVars)
	{
		String userName=pathVars.get("userName");
		String country=pathVars.get("country");
		
		ModelAndView model=new ModelAndView("showData");
		model.addObject("userName",userName);
		model.addObject("country",country);
		
		return model;
	}
}
