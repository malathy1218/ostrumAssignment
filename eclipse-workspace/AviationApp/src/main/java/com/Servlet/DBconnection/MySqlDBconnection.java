package com.Servlet.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySqlDBconnection {
	private static final MySqlDBconnection MySqlDbConnection = null;
	static Connection con;
	private static MySqlDBconnection mySqlDbInstance = new MySqlDBconnection();

	private MySqlDBconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aviation", "root", "malathy1987");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static Connection getInstance() {
		return mySqlDbInstance.con;
	}
	public static void main(String[] args) {
		System.out.println(MySqlDBconnection.getInstance());
	}
}



