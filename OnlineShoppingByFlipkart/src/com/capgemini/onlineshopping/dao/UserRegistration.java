package com.capgemini.onlineshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.DatabaseConnectionForOnlineShopping.DatabaseConnectionFactory;
import com.capgemini.onlineshopping.shoppingpojoclasses.RegistartionPojo;

public class UserRegistration {

	public void select() throws ClassNotFoundException, SQLException {

		Connection connection = DatabaseConnectionFactory.getConnection();

		System.out.println(connection);
		
		PreparedStatement preparedstatement = connection.prepareStatement("select * from UserRegistrations");
		ResultSet resultset = preparedstatement.executeQuery();
		System.out.println(resultset);
		while (resultset.next()) {
			System.out.println(resultset.getString("Firstname") + "  " + resultset.getString("Lastname") + "  "
					+ resultset.getString("Password") + "  " + resultset.getString("ConfirmPassword") + "  "
					+ resultset.getString("Registratedemail") + "  " + resultset.getLong("Phonenumber"));
		}
		connection.close();

	}
	
	 public String insert(RegistartionPojo pojo) throws ClassNotFoundException, SQLException{ 
		 Connection connection = DatabaseConnectionFactory.getConnection();
	 String insertquery = " insert into UserRegistrations(Firstname, Lastname, Password, ConfirmPassword, Registratedemail,Phonenumber)"
		        + " values (?, ?, ?, ?, ?,?)";
	 PreparedStatement preparedstatement = connection.prepareStatement(insertquery);
	 preparedstatement.setString(1,pojo.getFirstname());
	 preparedstatement.setString(2,pojo.getLastName());
	 preparedstatement.setString(3,pojo.getPassword());
	 preparedstatement.setString(4,pojo.getConfirmPassword());
	 preparedstatement.setString(5,pojo.getRegistratedEmail());
	 preparedstatement.setString(6, pojo.getPhonenumber());
	 
	// ResultSet resultset =  
			 preparedstatement.executeQuery();
//	 while (resultset.next()) {
//			System.out.println(resultset.getString("Firstname") + "  " + resultset.getString("Lastname") + "  "
//					+ resultset.getString("Password") + "  " + resultset.getString("ConfirmPassword") + "  "
//					+ resultset.getString("Registratedemail") + "  " + resultset.getLong("Phonenumber"));
//		}     
	  String output="inserted successfully";
	return output;
	  }
	 public int read(RegistartionPojo pojo) throws ClassNotFoundException , SQLException{
		 int i=0;
		 Connection connection = DatabaseConnectionFactory.getConnection();
		 String readquery = "select COUNT(*) from UserRegistrations WHERE Registratedemail=? AND Password=?";
		 PreparedStatement preparedstatement = connection.prepareStatement(readquery);
		 preparedstatement.setString(1, pojo.getRegistratedEmail());
		 preparedstatement.setString(2, pojo.getPassword());
		 ResultSet resultset =  preparedstatement.executeQuery();
		 while(resultset.next()) {
			i = resultset.getInt(1);
		 }
		return i;
	 }
	 

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserRegistration userregistration = new UserRegistration();
		RegistartionPojo pojo=new RegistartionPojo("vdya","sree","vdya@kalyan","vdya@kalyan","vdy@gmail.com","875765777");
		//userregistration.select();
		System.out.println(pojo);
		System.out.println(userregistration.insert(pojo));
		System.out.println(userregistration.read(pojo));
	}

}
