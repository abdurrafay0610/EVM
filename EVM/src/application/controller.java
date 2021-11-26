package application;

import java.io.IOException;
import java.sql.SQLException;
import java.util.EventObject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class controller 
{	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//scene switching ftns
	public void Scene1to2(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	//
	public void up(ActionEvent e) throws ClassNotFoundException, SQLException
	{
		OracleDB obj = new OracleDB();
		System.out.println("Action");
	}
	
}
