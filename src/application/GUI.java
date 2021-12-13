package application;
// Imports
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class GUI extends Application{
	// Variables for Bar graph
	  private static String ten2020 = "10:00AM";
	  private static String ten2021 = "10:00AM";
	  private static String eleven2020 = "11:00AM";
	  private static String eleven2021 = "11:00AM";
	  private static String twelve2020 = "12:00PM";
	  private static String twelve2021 = "12:00PM";
	  private static String one2020 = "1:00PM";
	  private static String one2021 = "1:00PM";
	  private static String three2020 = "3:00PM";
	  private static String three2021 = "3:00PM";
	  private static String four2020 = "4:00PM";
	  private static String four2021 = "4:00PM";
	    
	    // Start Method
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Reservations calcPane = new Reservations();
		//Setting primary stage and title
		primaryStage.setScene(new Scene(calcPane, calcPane.getPrefWidth() + 800.0, calcPane.getPrefHeight() + 700.0 ));
		primaryStage.setTitle("Reservation Times");//Title of the calculator
		primaryStage.show();
		}
	

	
	


	public static void main(String[] args) {
		launch(args);
	
	}
	

// Reservations class, main class
	private class Reservations extends GridPane {
		
		CAL cal = new CAL();		
		
	
	
		dateApp date = new dateApp();
		 
	

		  
// Labels, text fields, and buttons
	Label Res = new Label("Enter 1 for reserved spots 0 for non-reserved spots.");

	Label ten = new Label("10:00 AM:");//first label
	TextField tenText = new TextField();

	Label eleven = new Label("11:00 AM:");//second label
	TextField elevenText = new TextField();

	Label twelve = new Label("12:00 PM:");//Third label
	TextField twelveText = new TextField();

	Label one = new Label("1:00 PM:");//Fourth label
	TextField oneText = new TextField();

	Label three = new Label("3:00 PM:");//Fifth label
	TextField threeText = new TextField();

	Label four = new Label("4:00 PM:");//Sixth label
	TextField fourText = new TextField();
	
	

// Buttons 

	Button ADDBtn = new Button("Add");//Add button

	Button getTimes = new Button("Get Numbers/Chart"); //Chart/get numbers button
	
	Button close = new Button("Close");//Close button
	

	
//Labels for text areas	
	Label textArea = new Label(tenText.getText() + date.toStringThen() + cal.toString()); //Last years numbers
	
	
	Label textArea2 = new Label( dateApp.toStringToday() + " " + trying() + "\n"); //Numbers as of today.

	private Reservations() {

	// Create layout
	setPadding(new Insets(10, 10, 10, 10));
	setAlignment(Pos.CENTER);
	setHgap(10);
	setVgap(10);
	
	//Positions of text boxes and labels 

	add(Res, 0, 0);
	

	add(ten, 0, 1);
	add(tenText, 1, 1);

	add(eleven, 0, 2);
	add(elevenText, 1, 2);

	add(twelve, 0, 3);
	add(twelveText, 1, 3);

	add(one, 0, 4);
	add(oneText, 1, 4);

	add(three, 0, 5);
	add(threeText, 1, 5);

	add(four, 0, 6);
	add(fourText, 1, 6);
	


	//Button for adding in data to newData.txt file
	HBox buttons = new HBox();
	buttons.getChildren().add(ADDBtn);

	buttons.setAlignment(Pos.BOTTOM_RIGHT);//position of the button
	add(buttons, 1, 7);
	ADDBtn.setOnAction(new EventHandler<ActionEvent>() {
	    @Override public void handle(ActionEvent e) {
	        try (PrintWriter out = new PrintWriter(new BufferedWriter(
	                new FileWriter("newData.txt", true)))) {
	        	try {
	        
	       //Parse int on text boxes
	        	int ten = Integer.parseInt(tenText.getText());
	        	int eleven = Integer.parseInt(elevenText.getText());
	        	int twelve = Integer.parseInt(twelveText.getText());
	        	int one = Integer.parseInt(oneText.getText());
	        	int three = Integer.parseInt(threeText.getText());
	        	int four = Integer.parseInt(fourText.getText());
	        	
	       //Must be a 1 or 0 and cannot be left blank
	        	if(ten != 1 && ten != 0) {
	    			showMessageDialog(null, "10:00 field Must be a 1 or 0");
	        	}
	        	else if(eleven != 1 && eleven != 0) {
	            	showMessageDialog(null, "11:00 field Must be a 1 or 0");
	            }
	        	else if(twelve != 1 && twelve != 0) {
	            	showMessageDialog(null, "12:00 field Must be a 1 or 0");
	            }
	        	else if(one != 1 && one != 0) {
	            	showMessageDialog(null, "1:00 field Must be a 1 or 0");
	            }
	        	else if(three != 1 && three != 0) {
	            	showMessageDialog(null, "3:00 field Must be a 1 or 0");
	            }
	        	else if(four != 1 && four != 0) {
	            	showMessageDialog(null, "4:00 field Must be a 1 or 0");
	            }
	            else {
	            	
	            // Writing data to newData.txt
	            	
	            	out.write(fourText.getText());
	            	out.write(threeText.getText());
	            	out.write(oneText.getText());
	            	out.write(twelveText.getText());
	            	out.write(elevenText.getText());
	            	out.write(tenText.getText());
	            
	            //Flush, show message, and close after add button is clicked.
	            	out.flush();
	            	showMessageDialog(null, "Numbers added. Restart application to see updated numbers.");
	            	Platform.exit();
	            	
	            	
	            }
	        	
	        	//Catch for if text areas are left blank
	        	}catch(NumberFormatException e1) {
	        		showMessageDialog(null, "Text areas cannot be left blank");
	        	}
	        		 
	        	//After button press clear text fields
	            tenText.clear();
	            elevenText.clear();
	            twelveText.clear();
	            oneText.clear();
	            threeText.clear();
	            fourText.clear();
	        } catch (IOException ioe) {
	            ioe.printStackTrace();
	        }
	    }
	});

	
//Button for bar graph and getting numbers from CAL and newData
	HBox button = new HBox();
	button.getChildren().add(getTimes);
	button.setAlignment(Pos.BOTTOM_RIGHT);
	add(button, 2, 7);
	getTimes.setOnAction(new EventHandler<ActionEvent>() {
	    @SuppressWarnings({ "unchecked", "rawtypes", "static-access" })
		@Override public void handle(ActionEvent e) {
	    	VBox vbox = new VBox();
	    	vbox.getChildren().addAll(textArea);

	    	vbox.setAlignment(Pos.BOTTOM_RIGHT);//Button position
	    	add(textArea, 0, 8);
	    	add(textArea2, 1, 8);
	    	
	    	// Bar graph to show up when button is pressed
	   	    Stage newWindow = new Stage();
	    	 CAL cal = new CAL();
	    	    newData newD = new newData();
	    	    newWindow.setTitle("Reservation Numbers");
	            final CategoryAxis xAxis = new CategoryAxis();
	            final NumberAxis yAxis = new NumberAxis();
	            final BarChart<String,Number> bc = 
	                new BarChart<String,Number>(xAxis,yAxis);  
	            
	            //Displaying data from CAL and newData
	            bc.setTitle("Reserved");
	            xAxis.setLabel("Time Slot");       
	            yAxis.setLabel("Value");
	            XYChart.Series series1 = new XYChart.Series();
	            //2020 data (x, y)
	            series1.setName("2020");       
	            series1.getData().add(new XYChart.Data(ten2020, cal.ten(0)));  
	            series1.getData().add(new XYChart.Data(eleven2020, cal.eleven(0)));     
	            series1.getData().add(new XYChart.Data(twelve2020, cal.twelve(0)));   
	            series1.getData().add(new XYChart.Data(one2020, cal.one(0))); 
	            series1.getData().add(new XYChart.Data(three2020, cal.three(0))); 
	            series1.getData().add(new XYChart.Data(four2020, cal.four(0))); 
	            //2021 data (x, y)
	            XYChart.Series series2 = new XYChart.Series();
	            series2.setName("2021");
	            series2.getData().add(new XYChart.Data(ten2021, newD.ten() / 2));
	            series2.getData().add(new XYChart.Data(eleven2021, newD.eleven() / 2));
	            series2.getData().add(new XYChart.Data(twelve2021, newD.twelve() / 2)); 
	            series2.getData().add(new XYChart.Data(one2021, newD.one() / 2)); 
	            series2.getData().add(new XYChart.Data(three2021, newD.three() / 2)); 
	            series2.getData().add(new XYChart.Data(four2021, newD.four() / 2)); 
	            
	            //Display scene offset from first box
	            Scene secondScene = new Scene(bc, 800, 600);
	            bc.getData().add(series1);
	            bc.getData().add(series2);
	            newWindow.setScene(secondScene);
	            newWindow.setX(100);
	            newWindow.setY(-10);
	            newWindow.show();
	           
		
	    }
	    
	});
	 
	//3rd button to close application
	
	HBox button3 = new HBox();
	 button3.getChildren().add(close);
	 button3.setAlignment(Pos.BOTTOM_RIGHT);//Button position
	 add(button3, 3, 7);
	 close.setOnAction(ActionEvent -> {
	 Platform.exit();
	 });
	 	
	
	// Editing TextField settings
	TextField[] textFields = (TextField[])getArray(
	tenText, elevenText, twelveText, oneText, threeText, fourText);//array of textfields

	for (TextField tf : textFields) {
	tf.setAlignment(Pos.BASELINE_RIGHT);//set alignment of text fields to right
	}
	

	}
	//Setting getArray()/ looping arrays.
	private Object[] getArray(Object... objects) {
	Object[] temp = new TextField[objects.length];
	for (int i = 0; i < objects.length; i++) {
	temp[i] = objects[i];
	}
	return temp;
	}
	
	//Calling setter from newData.
 public String trying(){
		
    	return newData.setter();
    	
 }

	
	}

}





