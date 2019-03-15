package com.capgemini.pojostudent;



import java.util.ArrayList;

public class PojoStudentDetails {

	private String StudentFirstName;
	private String StudentLastName;
	private String StudentAge;
	private String StudentCollege;
	private String StudentDegree;
	private ArrayList <String> StudentSkills;
	private String StudentAddress;
	public String getStudentFirstName() {
		return StudentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		StudentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return StudentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		StudentLastName = studentLastName;
	}
	public String getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(String studentAge) {
		StudentAge = studentAge;
	}
	public String getStudentCollege() {
		return StudentCollege;
	}
	public void setStudentCollege(String studentCollege) {
		StudentCollege = studentCollege;
	}
	public String getStudentDegree() {
		return StudentDegree;
	}
	public void setStudentDegree(String studentDegree) {
		StudentDegree = studentDegree;
	}
	public ArrayList<String> getStudentSkills() {
		return StudentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		StudentSkills = studentSkills;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	
	public PojoStudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PojoStudentDetails(String studentFirstName, String studentLastName, String studentAge, String studentCollege,
			String studentDegree, ArrayList<String> studentSkills, String studentAddress) {
		super();
		StudentFirstName = studentFirstName;
		StudentLastName = studentLastName;
		StudentAge = studentAge;
		StudentCollege = studentCollege;
		StudentDegree = studentDegree;
		StudentSkills = studentSkills;
		StudentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "PojoStudentDetails [StudentFirstName=" + StudentFirstName + ", StudentLastName=" + StudentLastName
				+ ", StudentAge=" + StudentAge + ", StudentCollege=" + StudentCollege + ", StudentDegree="
				+ StudentDegree + ", StudentSkills=" + StudentSkills + ", StudentAddress=" + StudentAddress + "]";
	}
	
	
}

