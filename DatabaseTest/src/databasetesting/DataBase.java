package databasetesting;

import java.sql.*;
public class DataBase {
	public static void main(String[] args) {
		  System.out.println("MySQL Connect Example.");
		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "Test";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "username"; 
		  String password = "password";
		  try {
		  Class.forName(driver).newInstance();
		  conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Connected to the database");
		  conn.close();
		  System.out.println("Disconnected from database");
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
		  }

}
