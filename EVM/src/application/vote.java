package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class vote 
{
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void PTI(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("votesuccessfull.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void PMLN(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("votesuccessfull.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void PMLQ(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("votesuccessfull.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void PPP(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("votesuccessfull.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void MQM(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("votesuccessfull.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void JUI(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("votesuccessfull.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void VoteSuccessfull(ActionEvent e) throws IOException
	{
		root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
