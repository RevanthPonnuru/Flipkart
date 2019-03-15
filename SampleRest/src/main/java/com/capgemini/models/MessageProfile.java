package com.capgemini.models;

public class MessageProfile {

	private String Profilename;
	private String Firstname;
	private String Lastname;
	private String Createdon;
	
	public MessageProfile() {
		super();
		
	}

	public MessageProfile(String profilename, String firstname, String lastname, String createdon) {
		super();
		Profilename = profilename;
		Firstname = firstname;
		Lastname = lastname;
		Createdon = createdon;
	}

	public String getProfilename() {
		return Profilename;
	}

	public void setProfilename(String profilename) {
		Profilename = profilename;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getCreatedon() {
		return Createdon;
	}

	public void setCreatedon(String createdon) {
		Createdon = createdon;
	}

	@Override
	public String toString() {
		return "MessageProfile [Profilename=" + Profilename + ", Firstname=" + Firstname + ", Lastname=" + Lastname
				+ ", Createdon=" + Createdon + "]";
	}
	
}
