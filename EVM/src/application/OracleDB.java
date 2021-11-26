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
			
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("CREATE TABLE voter(CNIC NUMBER PRIMARY KEY,name VARCHAR(30),age NUMBER,done NUMBER)");
			rs = stmt.executeQuery("CREATE TABLE party(id NUMBER,name VARCHAR(30),votes NUMBER)");
			
		//	rs = stmt.executeQuery("INSERT INTO party(1,");
			
		}
		catch(SQLException e)
		{
			System.out.println("Connection not established");
		}
	}
	public void addVoter(int CNIC,String name,int age,int done) throws SQLException
	{
		try
		{
			String sql = "INSERT INTO VOTER (CNIC,NAME,AGE,NUMBER) VALUES (?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, CNIC);
			statement.setString(2, name);
			statement.setInt(3, age);
			statement.setInt(4, done);
			
			
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
