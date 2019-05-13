package com.gontuseries.studentAdmissionController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionFrom() {
		
		ModelAndView model1 = new ModelAndView("AdmissionForm");

		return model1;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFrom(@ModelAttribute("student1") Student student1) {
		
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		
		return model1;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
		model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
	}

}