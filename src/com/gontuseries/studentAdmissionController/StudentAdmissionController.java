package com.gontuseries.studentAdmissionController;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionFrom() throws Exception {
		
//		String exceptionOccured = "ARITHMETIC_EXCEPTION";
//		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
//			throw new NullPointerException("Null Pointer Exception");
//		} else if(exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
//			throw new IOException("IO EXCEPTION");
//		} else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {
//			throw new ArithmeticException("ARITHMETIC EXCEPTION");
//		}
		
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		return model1;
	}
	
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionFrom(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {
		
		if(result.hasErrors()) {
			
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
		model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
	}


	


	
}