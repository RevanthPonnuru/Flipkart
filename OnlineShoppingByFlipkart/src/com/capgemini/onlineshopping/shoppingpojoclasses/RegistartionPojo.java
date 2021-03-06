package com.capgemini.onlineshopping.shoppingpojoclasses;

public class RegistartionPojo {

	private String Firstname;
	private String LastName;
	private String Password;
	private String ConfirmPassword;
	private String RegistratedEmail;
	private String Phonenumber;

	public RegistartionPojo(String firstname, String lastName, String password, String confirmPassword,
			String registratedEmail, String phonenumber) {
		super();
		Firstname = firstname;
		LastName = lastName;
		Password = password;
		ConfirmPassword = confirmPassword;
		RegistratedEmail = registratedEmail;
		Phonenumber = phonenumber;
	}
	

	public RegistartionPojo(String password, String registratedEmail) {
		super();
		Password = password;
		RegistratedEmail = registratedEmail;
	}


	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public String getRegistratedEmail() {
		return RegistratedEmail;
	}

	public void setRegistratedEmail(String registratedEmail) {
		RegistratedEmail = registratedEmail;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}


}
