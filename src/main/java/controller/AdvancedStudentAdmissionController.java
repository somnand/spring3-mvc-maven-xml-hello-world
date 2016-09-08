package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import types.AdvancedStudent;
import types.Employee;
@Controller
public class AdvancedStudentAdmissionController{

	@RequestMapping(value="/getAdvancedAdmissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("advanced_admission_form");
		System.out.println("Handling Advanced student");
		return model;
	}
	
	/*@RequestMapping(value="/submitAdvancedAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student studentInMethod)
	{
		ModelAndView model=new ModelAndView("advanced_success");
		
		return model;
	}*/
	@RequestMapping(value="/submitAdvancedAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdvancedAdmissionForm(@ModelAttribute("advancedStudent") AdvancedStudent studentInMethod,@ModelAttribute("advancedEmployee") Employee employeeInMethod)
	{
		ModelAndView model=new ModelAndView("advanced_success");
		System.out.println(employeeInMethod);	
		return model;
	}
	
	
}
