package com.capgemini.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.pojoclasses.RegistrationPojo;
import com.capgemini.RegistartionDao.*;

@Controller
public class RegistrationController {
	
	

	  @RequestMapping(value = "/RegistrationController", method =
	  RequestMethod.GET) public ModelAndView showRegister(HttpServletRequest
	  request, HttpServletResponse response) { ModelAndView mav = new
	  ModelAndView("ShoppingRegistrationController"); mav.addObject("userRegister",
	  new RegistrationPojo()); return mav;
	  }
	 
	/*
	 * @RequestMapping(value = "/registrationcontroller1", method =
	 * RequestMethod.POST) public ModelAndView addUser(HttpServletRequest request,
	 * HttpServletResponse response,
	 * 
	 * @ModelAttribute("userRegister") RegistrationPojo userRegister) throws
	 * Exception { System.out.println("Hello");
	 * RegistrationPojo.register(userRegister);
	 
	  
		return new ModelAndView("", "firstname", ((RegistrationPojo) userRegister).getFirstname());*/
	}

