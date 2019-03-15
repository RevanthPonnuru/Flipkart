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
import com.capgemini.RegistartionDao.UserRegistrationDao;
import com.capgemini.controllers.*;
@Controller
public class LoginController<UserService> {
  @Autowired
  public UserService userService;
  @RequestMapping(value = "/ShoppingLogin", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("ShoppingLogin");
    mav.addObject("ShoppingLogin", new LoginController());
    return mav;
  }
  @RequestMapping(value = "/ShoppingLogin", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("ShoppingLogin") LoginController login) {
    ModelAndView mav = null;
    RegistrationPojo registrationpojo = ((RegistrationPojo) userService).validateUser(login);
    if (null != registrationpojo) {
    mav = new ModelAndView("welcome");
    mav.addObject("firstname", registrationpojo.getFirstname());
    } else {
    mav = new ModelAndView("ShoppingLogin");
    mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }
}