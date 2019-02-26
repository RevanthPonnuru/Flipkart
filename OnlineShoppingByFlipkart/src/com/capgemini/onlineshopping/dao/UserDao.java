package com.capgemini.onlineshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.DatabaseConnectionForOnlineShopping.DatabaseConnectionFactory;

public class UserDao {

	public void select() throws ClassNotFoundException, SQLException {

		Connection con = DatabaseConnectionFactory.getConnection();

		System.out.println(con);
		
		PreparedStatement stmt = con.prepareStatement("select * from UserRegistrations");
		ResultSet rs = stmt.executeQuery();
		System.out.println(rs);
		while (rs.next()) {
			System.out.println(rs.getString("Firstname") + "  " + rs.getString("Lastname") + "  "
					+ rs.getString("Password") + "  " + rs.getString("ConfirmPassword") + "  "
					+ rs.getString("Registratedemail") + "  " + rs.getLong("phonenumber"));
		}
		con.close();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();
		dao.select();
	}

}
