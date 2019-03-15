package com.capgemini.pojoclasses;

import com.capgemini.controllers.LoginController;

public class RegistrationPojo {

	private String username;	
	private String firstname;
	private String lastname;
	private String password;
	private String Gender;
	private String email;
	private String address;
	private int phone;
	
	public RegistrationPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistrationPojo(String username, String firstname, String lastname, String password, String gender,
			String email, String address, int phone) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		Gender = gender;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "RegistrationPojo [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", Gender=" + Gender + ", email=" + email + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	public RegistrationPojo validateUser(LoginController login) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void register(RegistrationPojo userRegister) {
		// TODO Auto-generated method stub
		
	}
	
	
}
