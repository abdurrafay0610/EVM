//code taken from https://github.com/afsalashyana/JavaFX-Tutorial-Codes/blob/master/JavaFX%20Calculator/src/genuinecoder/main/CalculatorController.java
//also calculator.fxml also taken from the above github
package application;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Villan
 */
public class CalculatorController implements Initializable 
{
	private Stage stage;
	private Scene scene;
	private Parent root;

    Float data = 0f;
    int operation = -1;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button four;

    @FXML
    private Button Enter;

    @FXML
    private Button five;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        if (event.getSource() == one) 
        {
            display.setText(display.getText() + "1");
        } 
        else if (event.getSource() == two) 
        {
            display.setText(display.getText() + "2");
        } 
        else if (event.getSource() == three) 
        {
            display.setText(display.getText() + "3");
        } 
        else if (event.getSource() == four) 
        {
            display.setText(display.getText() + "4");
        } 
        else if (event.getSource() == five) 
        {
            display.setText(display.getText() + "5");
        } 
        else if (event.getSource() == six) 
        {
            display.setText(display.getText() + "6");
        } 
        else if (event.getSource() == seven) 
        {
            display.setText(display.getText() + "7");
        } 
        else if (event.getSource() == eight) 
        {
            display.setText(display.getText() + "8");
        } 
        else if (event.getSource() == nine) 
        {
            display.setText(display.getText() + "9");
        } 
        else if (event.getSource() == zero) 
        {
            display.setText(display.getText() + "0");
        } 
        else if (event.getSource() == clear) 
        {
            display.setText("");
        }
        else if (event.getSource() == Enter) 
        {
        	System.out.println(display.getText());
        	
        	root = FXMLLoader.load(getClass().getResource("vote.fxml"));
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }

}