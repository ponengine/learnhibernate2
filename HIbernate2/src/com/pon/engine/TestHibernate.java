package com.pon.engine;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestHibernate {
	public static void main(String[] args) {
		String jdbcUrl  ="jdbc:mysql://localhost:3306/hibernate2?userSSL=false";
		String user = "root";
		String pass = "";
		try{
			System.out.println("Connecting to database:"+jdbcUrl);
			Connection conn= DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connect Success");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
