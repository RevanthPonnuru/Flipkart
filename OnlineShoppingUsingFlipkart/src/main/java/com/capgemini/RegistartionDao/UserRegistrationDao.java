package com.capgemini.RegistartionDao;

import com.capgemini.controllers.LoginController;
import com.capgemini.pojoclasses.RegistrationPojo;

public class UserRegistrationDao {

	public interface UserDao {
		  void register(RegistrationPojo userRegister);
		  RegistrationPojo validateUser(LoginController login);

		  
		}
}
