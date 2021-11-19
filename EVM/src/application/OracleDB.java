package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDB extends PersistanceManager
{
	OracleDB() throws ClassNotFoundException
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYED","scott","1234");
			
			System.out.println("Connection Established");
			
			//creating schema
			/*
			Statement stmt = con.createStatement();

			ResultSet rs=stmt.executeQuery("CREATE TABLE checking(id NUMBER PRIMARY KEY,balance NUMBER,datte VARCHAR(30))");
			rs=stmt.executeQuery("CREATE TABLE saving(id NUMBER PRIMARY KEY,balance NUMBER,datte VARCHAR(30))");
			*/
		}
		catch(SQLException e)
		{
			System.out.println("Connection not established");
		}
	}
	public void test() throws SQLException
	{
		try
		{
			String sql = "INSERT INTO DEMO (ID) VALUES (?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, 4);
			
			int rowsInserted = statement.executeUpdate();
			
			if(rowsInserted>0)
			{
				System.out.println("Successful");
			}
		}
		catch(SQLException e)
		{
			System.out.println("SQL query failed");
		}
		
	}
}
