package com.capgemini.onlineshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.DatabaseConnectionForOnlineShopping.DatabaseConnectionFactory;
import com.capgemini.onlineshopping.shoppingpojoclasses.RegistartionPojo;
import com.capgemini.onlineshopping.shoppingpojoclasses.ShoppingProductsPojo;

public class ShoppingProductsDao {

	public void select() throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnectionFactory.getConnection();
		System.out.println(connection);
		PreparedStatement preparedstatement = connection.prepareStatement("select * from Products");
		ResultSet resultset =  preparedstatement.executeQuery();
		System.out.println(resultset);
		while (resultset.next()) {
			System.out.println(resultset.getString("ProductId") + "  " + resultset.getString("ProductName") + "  "
					+ resultset.getString("ProductDescription") + "  " + resultset.getString("ProductSpecification")); 
		}
		connection.close();

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ShoppingProductsDao shoppingproductsdao = new ShoppingProductsDao();
		ShoppingProductsPojo shopppingproductspojo=new ShoppingProductsPojo("ProductId","ProductName","ProductDescription","ProductSpecification");
		shoppingproductsdao.select();
		System.out.println(shopppingproductspojo);
		/*
		 * System.out.println(userregistration.insert(pojo));
		 * System.out.println(userregistration.read(pojo));
		 */
	}

	}

  