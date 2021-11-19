package application;

import java.sql.SQLException;

import javafx.event.ActionEvent;

public class controller 
{
	public void up(ActionEvent e) throws ClassNotFoundException, SQLException
	{
		OracleDB obj = new OracleDB();
		obj.test();
		System.out.println("Action");
	}
}
