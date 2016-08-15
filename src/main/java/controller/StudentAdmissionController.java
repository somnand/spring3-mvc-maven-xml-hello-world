package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/getAdmissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("admission_form");
		return model;
	}
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby)
	{
		ModelAndView model=new ModelAndView("successful");
		String statusMessage="Details submitted by you : Name: "+name+" Hobby: "+hobby;
		
		model.addObject("status",statusMessage);
		
		return model;
	}	
}
