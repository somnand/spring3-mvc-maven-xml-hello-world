package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import types.Student;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/getAdmissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("admission_form");
		return model;
	}
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> varParms)
	{
		Student studentInMethod=new Student();		
		ModelAndView model=new ModelAndView("successful");
		
		String name=varParms.get("studentName");
		String hobby=varParms.get("studentHobby");
		String statusMessage="Details submitted by you : Name: "+name+" Hobby: "+hobby;
		studentInMethod.setName(name);
		studentInMethod.setHobby(hobby);
		model.addObject("status",statusMessage);
		model.addObject("student",studentInMethod);
		return model;
	}	
}
