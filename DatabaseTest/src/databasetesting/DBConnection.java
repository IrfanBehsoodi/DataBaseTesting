package databasetesting;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnection {
	
	public void connection() {
		
			// JDBC driver name and database URL
			final String JDBC_Driver = "com.mysql.jdc.driver";
			final String DB_URL = "jdbc:mysql://localhost:3036/testdb";
	
			// Database Credentials
			final String user = "user";
			final String password = "pass";
			
			java.sql.Connection connect = null;
			java.sql.Statement state = null;
			
				try {
					Class.forName(JDBC_Driver);
			
				// Open a connection
								try {
									connect = DriverManager.getConnection(DB_URL, user, password);
									
									// Execute the Query					
									state = connect.createStatement();
									String sql = "select *  from employee;";
									ResultSet executeQuery = state.executeQuery(sql);
									// Extract Data from Query
									while (executeQuery.next()){
						        		String myName = executeQuery.getString(1);								        
				                        String myAge = executeQuery.getString(2);					                               
				                        System. out.println(myName+"  "+myAge);		
				                }
									executeQuery.close();
									state.close();
									connect.close();
									
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
				
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
	}
	
}
