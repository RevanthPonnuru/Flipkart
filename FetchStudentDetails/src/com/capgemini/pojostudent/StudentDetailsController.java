package com.capgemini.pojostudent;
import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentDetailsController{
	@RequestMapping(value = "/studentdetailsform.jsp", method= RequestMethod.GET)
	public ModelAndView getDetailsForm() {
		
		ModelAndView modelandview = new ModelAndView("StudentDetailsForm");
		return modelandview;
}
	
	@ModelAttribute
	public void addNonFunctionalObjects(Model modelandview) {
		modelandview.addAttribute("HeaderMessage", "DetailedForm");
	}
	
	@RequestMapping(value = "/display.html", method = RequestMethod.GET)
	public ModelAndView fetchDetails(@ModelAttribute("student")PojoStudentDetails student ) {
		System.out.println("Revanth");
		ModelAndView modelandview = new ModelAndView("displaystudentdetails");
		return modelandview;
		
	}
	
	
}
