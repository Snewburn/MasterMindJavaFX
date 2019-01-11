package application;
	

import java.util.Optional;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;



public class Main extends Application 
{
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	
	//create control names
	static Button btnStart, btnEnd;
	static Button btnGuess1, btnGuess2, btnGuess3, btnGuess4, btnGuess5;
	static Button btnGuess6, btnGuess7, btnGuess8, btnGuess9, btnGuess10;
		
	static ChoiceBox<String> choicePeg1, choicePeg2, choicePeg3, choicePeg4, choicePeg5, choicePeg6;
	static ChoiceBox<String> choicePeg7, choicePeg8, choicePeg9, choicePeg10, choicePeg11, choicePeg12;
	static ChoiceBox<String> choicePeg13, choicePeg14, choicePeg15, choicePeg16, choicePeg17, choicePeg18;
	static ChoiceBox<String> choicePeg19, choicePeg20, choicePeg21, choicePeg22, choicePeg23, choicePeg24;
	static ChoiceBox<String> choicePeg25, choicePeg26, choicePeg27, choicePeg28, choicePeg29, choicePeg30;
	static ChoiceBox<String> choicePeg31, choicePeg32, choicePeg33, choicePeg34, choicePeg35, choicePeg36;
	static ChoiceBox<String> choicePeg37, choicePeg38, choicePeg39, choicePeg40;	
	
	
	static Label tfInstructions;
	static TextField tfRed1, tfWhite1, tfRed2, tfWhite2, tfRed3, tfWhite3, tfRed4, tfWhite4, tfRed5, tfWhite5; 
	static TextField tfRed6, tfWhite6, tfRed7, tfWhite7, tfRed8, tfWhite8, tfRed9, tfWhite9, tfRed10, tfWhite10;
	
	static HBox hbButtons, hbChoices1, hbChoices2, hbChoices3, hbChoices4, hbChoices5, hbChoices6;
	static HBox hbChoices7, hbChoices8, hbChoices9, hbChoices10; 
	
	static char[] charTarget; 
	char[] playerGuess = new char[] {' ', ' ', ' ', ' '};


	@Override public void start(Stage primaryStage) 
	{
		//Create the Start button
		btnStart = new Button();
		btnStart.setText("Start Game");
		btnStart.setOnAction( e -> btnStart_Click() );
		
		//Create the End button
		btnEnd = new Button();
		btnEnd.setText("End Game");
		btnEnd.setOnAction( e -> majorButtonClick("end") );					
		
		//Add buttons to an HBox pane
		hbButtons = new HBox(10);
		hbButtons.getChildren().addAll(btnStart, btnEnd);
		hbButtons.setPadding(new Insets(15));
		hbButtons.setStyle("-fx-background-color: black");
		
		//Create choices for Guess 1 and place in HBox
		choicePeg1 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg1.setOnAction( e -> choicePeg_colorChange(choicePeg1) );
		
		choicePeg2 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg2.setOnAction( e -> choicePeg_colorChange(choicePeg2) );
		
		choicePeg3 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg3.setOnAction( e -> choicePeg_colorChange(choicePeg3) );
		
		choicePeg4 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg4.setOnAction( e -> choicePeg_colorChange(choicePeg4) );
		
		Label lblGuess1 = new Label("1:");
		lblGuess1.setMinWidth(20);
		Label lblRed1 = new Label("R:");
		lblRed1.setMinWidth(10);
		Label lblWhite1 = new Label("W:");
		lblWhite1.setMinWidth(10);
		
		tfRed1 = new TextField();
		tfRed1.setMaxWidth(25);
		tfWhite1 = new TextField();
		tfWhite1.setMaxWidth(25);
		
		btnGuess1 = new Button();
		btnGuess1.setText("Guess");
		btnGuess1.setDisable(true);
		btnGuess1.setOnAction( e -> btnGuess1_Click() );
		
		HBox hbRed1 = new HBox(10);
		hbRed1.getChildren().addAll(lblRed1, tfRed1);
		HBox hbWhite1 = new HBox(10);
		hbWhite1.getChildren().addAll(lblWhite1, tfWhite1);
		HBox grade1 = new HBox(10);
		grade1.getChildren().addAll(hbRed1, hbWhite1);
		
		hbChoices1 = new HBox(10);
		hbChoices1.getChildren().addAll(lblGuess1, choicePeg1, choicePeg2, choicePeg3, 
				choicePeg4, grade1, btnGuess1);
		hbChoices1.setPadding(new Insets(15));
				
		//Create choices for Guess 2 and place in HBox
		choicePeg5 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg5.setOnAction( e -> choicePeg_colorChange(choicePeg5) );
		
		choicePeg6 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg6.setOnAction( e -> choicePeg_colorChange(choicePeg6) );
		
		choicePeg7 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg7.setOnAction( e -> choicePeg_colorChange(choicePeg7) );
		
		choicePeg8 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg8.setOnAction( e -> choicePeg_colorChange(choicePeg8) );	
		
		Label lblGuess2 = new Label("2:");
		lblGuess2.setMinWidth(20);
		Label lblRed2 = new Label("R:");
		lblRed2.setMinWidth(10);
		Label lblWhite2 = new Label("W:");
		lblWhite2.setMinWidth(10);
		
		tfRed2 = new TextField();
		tfRed2.setMaxWidth(25);
		tfWhite2 = new TextField();
		tfWhite2.setMaxWidth(25);
		
		btnGuess2 = new Button();
		btnGuess2.setText("Guess");
		btnGuess2.setDisable(true);
		btnGuess2.setOnAction( e -> btnGuess2_Click() );
		
		HBox hbRed2 = new HBox(10);
		hbRed2.getChildren().addAll(lblRed2, tfRed2);
		HBox hbWhite2 = new HBox(10);
		hbWhite2.getChildren().addAll(lblWhite2, tfWhite2);
		HBox grade2 = new HBox(10);
		grade2.getChildren().addAll(hbRed2, hbWhite2);
		
		hbChoices2 = new HBox(10);
		hbChoices2.getChildren().addAll(lblGuess2, choicePeg5, choicePeg6, choicePeg7, 
				choicePeg8, grade2, btnGuess2);
		hbChoices2.setPadding(new Insets(15));
		
		
		//Create choices for Guess 3 and place in HBox
		choicePeg9 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg9.setOnAction( e -> choicePeg_colorChange(choicePeg9) );
		
		choicePeg10 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg10.setOnAction( e -> choicePeg_colorChange(choicePeg10) );
		
		choicePeg11 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg11.setOnAction( e -> choicePeg_colorChange(choicePeg11) );
		
		choicePeg12 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg12.setOnAction( e -> choicePeg_colorChange(choicePeg12) );
		
		
		Label lblGuess3 = new Label("3:");
		lblGuess3.setMinWidth(20);
		Label lblRed3 = new Label("R:");
		lblRed3.setMinWidth(10);
		Label lblWhite3 = new Label("W:");
		lblWhite3.setMinWidth(10);
		
		tfRed3 = new TextField();
		tfRed3.setMaxWidth(25);
		tfWhite3 = new TextField();
		tfWhite3.setMaxWidth(25);
		
		btnGuess3 = new Button();
		btnGuess3.setText("Guess");
		btnGuess3.setDisable(true);
		btnGuess3.setOnAction( e -> btnGuess3_Click() );
		
		HBox hbRed3 = new HBox(10);
		hbRed3.getChildren().addAll(lblRed3, tfRed3);
		HBox hbWhite3 = new HBox(10);
		hbWhite3.getChildren().addAll(lblWhite3, tfWhite3);
		HBox grade3 = new HBox(10);
		grade3.getChildren().addAll(hbRed3, hbWhite3);
		
		hbChoices3 = new HBox(10);
		hbChoices3.getChildren().addAll(lblGuess3, choicePeg9, choicePeg10, 
				choicePeg11, choicePeg12, grade3, btnGuess3);
		hbChoices3.setPadding(new Insets(15));
		
		
		//Create choices for Guess 4 and place in HBox
		choicePeg13 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg13.setOnAction( e -> choicePeg_colorChange(choicePeg13) );
		
		choicePeg14 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg14.setOnAction( e -> choicePeg_colorChange(choicePeg14) );
		
		choicePeg15 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg15.setOnAction( e -> choicePeg_colorChange(choicePeg15) );
		
		choicePeg16 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg16.setOnAction( e -> choicePeg_colorChange(choicePeg16) );
		
		
		Label lblGuess4 = new Label("4:");
		lblGuess4.setMinWidth(20);		
		Label lblRed4 = new Label("R:");
		lblRed4.setMinWidth(10);
		Label lblWhite4 = new Label("W:");
		lblWhite4.setMinWidth(10);
		
		tfRed4 = new TextField();
		tfRed4.setMaxWidth(25);
		tfWhite4 = new TextField();
		tfWhite4.setMaxWidth(25);
		
		btnGuess4 = new Button();
		btnGuess4.setText("Guess");
		btnGuess4.setDisable(true);
		btnGuess4.setOnAction( e -> btnGuess4_Click() );
		
		HBox hbRed4 = new HBox(10);
		hbRed4.getChildren().addAll(lblRed4, tfRed4);
		HBox hbWhite4 = new HBox(10);
		hbWhite4.getChildren().addAll(lblWhite4, tfWhite4);
		HBox grade4 = new HBox(10);
		grade4.getChildren().addAll(hbRed4, hbWhite4);
		
		hbChoices4 = new HBox(10);
		hbChoices4.getChildren().addAll(lblGuess4, choicePeg13, choicePeg14, 
				choicePeg15, choicePeg16, grade4, btnGuess4);
		hbChoices4.setPadding(new Insets(15));
		
		
		//Create choices for Guess 5 and place in HBox
		choicePeg17 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg17.setOnAction( e -> choicePeg_colorChange(choicePeg17) );
		
		choicePeg18 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg18.setOnAction( e -> choicePeg_colorChange(choicePeg18) );
		
		choicePeg19 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg19.setOnAction( e -> choicePeg_colorChange(choicePeg19) );
		
		choicePeg20 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg20.setOnAction( e -> choicePeg_colorChange(choicePeg20) );
		
		
		Label lblGuess5 = new Label("5:");
		lblGuess5.setMinWidth(20);		
		Label lblRed5 = new Label("R:");
		lblRed5.setMinWidth(10);
		Label lblWhite5 = new Label("W:");
		lblWhite5.setMinWidth(10);
		
		tfRed5 = new TextField();
		tfRed5.setMaxWidth(25);
		tfWhite5 = new TextField();
		tfWhite5.setMaxWidth(25);
		
		btnGuess5 = new Button();
		btnGuess5.setText("Guess");
		btnGuess5.setDisable(true);
		btnGuess5.setOnAction( e -> btnGuess5_Click() );
		
		HBox hbRed5 = new HBox(10);
		hbRed5.getChildren().addAll(lblRed5, tfRed5);
		HBox hbWhite5 = new HBox(10);
		hbWhite5.getChildren().addAll(lblWhite5, tfWhite5);
		HBox grade5 = new HBox(10);
		grade5.getChildren().addAll(hbRed5, hbWhite5);
		
		hbChoices5 = new HBox(10);
		hbChoices5.getChildren().addAll(lblGuess5, choicePeg17, choicePeg18, 
				choicePeg19, choicePeg20, grade5, btnGuess5);
		hbChoices5.setPadding(new Insets(15));
		
		//Create choices for Guess 6 and place in HBox
		choicePeg21 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg21.setOnAction( e -> choicePeg_colorChange(choicePeg21) );
		
		choicePeg22 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg22.setOnAction( e -> choicePeg_colorChange(choicePeg22) );
		
		choicePeg23 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg23.setOnAction( e -> choicePeg_colorChange(choicePeg23) );
		
		choicePeg24 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg24.setOnAction( e -> choicePeg_colorChange(choicePeg24) );
						
		Label lblGuess6 = new Label("6:");
		lblGuess6.setMinWidth(20);		
		Label lblRed6 = new Label("R:");
		lblRed6.setMinWidth(10);
		Label lblWhite6 = new Label("W:");
		lblWhite6.setMinWidth(10);
		
		tfRed6 = new TextField();
		tfRed6.setMaxWidth(25);
		tfWhite6 = new TextField();
		tfWhite6.setMaxWidth(25);
		
		btnGuess6 = new Button();
		btnGuess6.setText("Guess");
		btnGuess6.setDisable(true);
		btnGuess6.setOnAction( e -> btnGuess6_Click() );
		
		HBox hbRed6 = new HBox(10);
		hbRed6.getChildren().addAll(lblRed6, tfRed6);
		HBox hbWhite6 = new HBox(10);
		hbWhite6.getChildren().addAll(lblWhite6, tfWhite6);
		HBox grade6 = new HBox(10);
		grade6.getChildren().addAll(hbRed6, hbWhite6);
		
		hbChoices6 = new HBox(10);
		hbChoices6.getChildren().addAll(lblGuess6, choicePeg21, choicePeg22, 
				choicePeg23, choicePeg24, grade6, btnGuess6);
		hbChoices6.setPadding(new Insets(15));
			
		//Create choices for Guess 7 and place in HBox
		choicePeg25 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg25.setOnAction( e -> choicePeg_colorChange(choicePeg25) );
		
		choicePeg26 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg26.setOnAction( e -> choicePeg_colorChange(choicePeg26) );
		
		choicePeg27 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg27.setOnAction( e -> choicePeg_colorChange(choicePeg27) );
		
		choicePeg28 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg28.setOnAction( e -> choicePeg_colorChange(choicePeg28) );
		
		Label lblGuess7 = new Label("7:");
		lblGuess7.setMinWidth(20);
		Label lblRed7 = new Label("R:");
		lblRed7.setMinWidth(10);
		Label lblWhite7 = new Label("W:");
		lblWhite7.setMinWidth(10);
		
		tfRed7 = new TextField();
		tfRed7.setMaxWidth(25);
		tfWhite7 = new TextField();
		tfWhite7.setMaxWidth(25);
		
		btnGuess7 = new Button();
		btnGuess7.setText("Guess");
		btnGuess7.setDisable(true);
		btnGuess7.setOnAction( e -> btnGuess7_Click() );
		
		HBox hbRed7 = new HBox(10);
		hbRed7.getChildren().addAll(lblRed7, tfRed7);
		HBox hbWhite7 = new HBox(10);
		hbWhite7.getChildren().addAll(lblWhite7, tfWhite7);
		HBox grade7 = new HBox(10);
		grade7.getChildren().addAll(hbRed7, hbWhite7);
		
		hbChoices7 = new HBox(10);
		hbChoices7.getChildren().addAll(lblGuess7, choicePeg25, choicePeg26, 
				choicePeg27, choicePeg28, grade7, btnGuess7);
		hbChoices7.setPadding(new Insets(15));
			
		//Create choices for Guess 8 and place in HBox
		choicePeg29 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg29.setOnAction( e -> choicePeg_colorChange(choicePeg29) );
		
		choicePeg30 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg30.setOnAction( e -> choicePeg_colorChange(choicePeg30) );
		
		choicePeg31 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg31.setOnAction( e -> choicePeg_colorChange(choicePeg31) );
		
		choicePeg32 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg32.setOnAction( e -> choicePeg_colorChange(choicePeg32) );
		 
		Label lblGuess8 = new Label("8:");
		lblGuess8.setMinWidth(20);
		Label lblRed8 = new Label("R:");
		lblRed8.setMinWidth(10);
		Label lblWhite8 = new Label("W:");
		lblWhite8.setMinWidth(10);
		
		tfRed8 = new TextField();
		tfRed8.setMaxWidth(25);
		tfWhite8 = new TextField();
		tfWhite8.setMaxWidth(25);
		
		btnGuess8 = new Button();
		btnGuess8.setText("Guess");
		btnGuess8.setDisable(true);
		btnGuess8.setOnAction( e -> btnGuess8_Click() );
		
		HBox hbRed8 = new HBox(10);
		hbRed8.getChildren().addAll(lblRed8, tfRed8);
		HBox hbWhite8 = new HBox(10);
		hbWhite8.getChildren().addAll(lblWhite8, tfWhite8);
		HBox grade8 = new HBox(10);
		grade8.getChildren().addAll(hbRed8, hbWhite8);
		
		hbChoices8 = new HBox(10);
		hbChoices8.getChildren().addAll(lblGuess8, choicePeg29, choicePeg30,
				choicePeg31, choicePeg32, grade8, btnGuess8);
		hbChoices8.setPadding(new Insets(15));

		//Create choices for Guess 9 and place in HBox
		choicePeg33 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg33.setOnAction( e -> choicePeg_colorChange(choicePeg33) );
		
		choicePeg34 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg34.setOnAction( e -> choicePeg_colorChange(choicePeg34) );
		
		choicePeg35 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg35.setOnAction( e -> choicePeg_colorChange(choicePeg35) );
		
		choicePeg36 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg36.setOnAction( e -> choicePeg_colorChange(choicePeg36) );

		
		Label lblGuess9 = new Label("9:");
		lblGuess9.setMinWidth(20);
		Label lblRed9 = new Label("R:");
		lblRed9.setMinWidth(10);
		Label lblWhite9 = new Label("W:");
		lblWhite9.setMinWidth(10);
		
		tfRed9 = new TextField();
		tfRed9.setMaxWidth(25);
		tfWhite9 = new TextField();
		tfWhite9.setMaxWidth(25);
		
		btnGuess9 = new Button();
		btnGuess9.setText("Guess");
		btnGuess9.setDisable(true);
		btnGuess9.setOnAction( e -> btnGuess9_Click() );
		
		HBox hbRed9 = new HBox(10);
		hbRed9.getChildren().addAll(lblRed9, tfRed9);
		HBox hbWhite9 = new HBox(10);
		hbWhite9.getChildren().addAll(lblWhite9, tfWhite9);
		HBox grade9 = new HBox(10);
		grade9.getChildren().addAll(hbRed9, hbWhite9);
		
		hbChoices9 = new HBox(10);
		hbChoices9.getChildren().addAll(lblGuess9, choicePeg33, choicePeg34, 
				choicePeg35, choicePeg36, grade9, btnGuess9);
		hbChoices9.setPadding(new Insets(15));

		//Create choices for Guess 10 and place in HBox
		choicePeg37 = new ChoiceBox<String>(
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg37.setOnAction( e -> choicePeg_colorChange(choicePeg37) );
		
		choicePeg38 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg38.setOnAction( e -> choicePeg_colorChange(choicePeg38) );
		
		choicePeg39 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg39.setOnAction( e -> choicePeg_colorChange(choicePeg39) );
		
		choicePeg40 = new ChoiceBox<String>(				
				(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Orange", "White")));
		choicePeg40.setOnAction( e -> choicePeg_colorChange(choicePeg40) );

		
		Label lblGuess10 = new Label("10:");
		lblGuess10.setMinWidth(20);		
		Label lblRed10 = new Label("R:");
		lblRed10.setMinWidth(10);
		Label lblWhite10 = new Label("W:");
		lblWhite10.setMinWidth(10);
		
		tfRed10 = new TextField();
		tfRed10.setMaxWidth(25);
		tfWhite10 = new TextField();
		tfWhite10.setMaxWidth(25);
		
		btnGuess10 = new Button();
		btnGuess10.setText("Guess");
		btnGuess10.setDisable(true);
		btnGuess10.setOnAction( e -> btnGuess10_Click() );
		
		HBox hbRed10 = new HBox(10);
		hbRed10.getChildren().addAll(lblRed10, tfRed10);
		HBox hbWhite10 = new HBox(10);
		hbWhite10.getChildren().addAll(lblWhite10, tfWhite10);
		HBox grade10 = new HBox(10);
		grade10.getChildren().addAll(hbRed10, hbWhite10);
		
		hbChoices10 = new HBox(10);
		hbChoices10.getChildren().addAll(lblGuess10, choicePeg37, choicePeg38, 
				choicePeg39, choicePeg40, grade10, btnGuess10);
		hbChoices10.setPadding(new Insets(15));				
		
		//Add Choice Pegs and Buttons to Vertical Pane
		VBox playingField = new VBox();
		playingField.getChildren().addAll(hbChoices10, hbChoices9, hbChoices8, hbChoices7, 
				hbChoices6, hbChoices5, hbChoices4, hbChoices3, hbChoices2, hbChoices1, hbButtons);
		playingField.setPadding(new Insets(3));
		
		//disable all choices			
		choicePeg1.setDisable(true);
		choicePeg2.setDisable(true); choicePeg3.setDisable(true); choicePeg4.setDisable(true); 
		choicePeg5.setDisable(true); choicePeg6.setDisable(true); choicePeg7.setDisable(true); 
		choicePeg8.setDisable(true); choicePeg9.setDisable(true); choicePeg10.setDisable(true); 
		choicePeg11.setDisable(true); choicePeg12.setDisable(true); choicePeg13.setDisable(true); 
		choicePeg14.setDisable(true); choicePeg15.setDisable(true); choicePeg16.setDisable(true); 
		choicePeg17.setDisable(true); choicePeg18.setDisable(true); choicePeg19.setDisable(true); 
		choicePeg20.setDisable(true); choicePeg21.setDisable(true); choicePeg22.setDisable(true); 
		choicePeg23.setDisable(true); choicePeg24.setDisable(true); choicePeg25.setDisable(true); 
		choicePeg26.setDisable(true); choicePeg27.setDisable(true); choicePeg28.setDisable(true); 
		choicePeg29.setDisable(true); choicePeg30.setDisable(true); choicePeg31.setDisable(true); 
		choicePeg32.setDisable(true); choicePeg33.setDisable(true); choicePeg34.setDisable(true); 
		choicePeg35.setDisable(true); choicePeg36.setDisable(true); choicePeg37.setDisable(true); 
		choicePeg38.setDisable(true); choicePeg39.setDisable(true); choicePeg40.setDisable(true);
	
		
		//Create Instructions message and win/loss field
		tfInstructions = new Label("Welcome to MasterMind");
		tfInstructions.setMaxSize(500, 100);
		tfInstructions.setMinSize(500, 100);
		
		VBox vbUpperText = new VBox(10);
		vbUpperText.getChildren().addAll(tfInstructions);
		vbUpperText.setPadding(new Insets(20));
		
		//place upper text and playing field in VBOX
		VBox allGame = new VBox(10);
		allGame.getChildren().addAll(vbUpperText, playingField);
		
		//Add paneButtons to a scene
		Scene scenePlayingField = new Scene(allGame, 10, 10);
		

		
		//Add sceneButtons to a scene and show the stage
		primaryStage.setScene(scenePlayingField);
		primaryStage.setTitle("Master Mind");
		primaryStage.setMinWidth(700);
		primaryStage.setMaxWidth(1000);
		primaryStage.setMinHeight(900);
		primaryStage.setMaxHeight(1500);
		primaryStage.show();
	}

	private void btnStart_Click()
	{
		//generate a random target
		charTarget = Generate.generateTarget();				
		
		//disable/enable controls
		choicePeg1.setDisable(false);	//enable row 1
		choicePeg2.setDisable(false);
		choicePeg3.setDisable(false);
		choicePeg4.setDisable(false);
		btnStart.setDisable(true);
		btnGuess1.setDisable(false);
		
		//set all choices color background to white
		setChoicesBackgroundWhite();
		//set message to playing
		tfInstructions.setText("Figure out the winning Code");
	}
			
	private void btnGuess1_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg1.getValue() == null || choicePeg2.getValue() == null || 
				choicePeg3.getValue() == null || choicePeg4.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg1.getValue(), choicePeg2.getValue(), 
				choicePeg3.getValue(), choicePeg4.getValue()};			
		
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed1.setText(Integer.toString(pegs[0]));
			tfWhite1.setText(Integer.toString(pegs[1]));
			
			//enable/disable controls
			choicePeg1.setDisable(true);	//disable row 1
			choicePeg2.setDisable(true);
			choicePeg3.setDisable(true);
			choicePeg4.setDisable(true);
			choicePeg5.setDisable(false);	//enable row 2
			choicePeg6.setDisable(false);
			choicePeg7.setDisable(false);
			choicePeg8.setDisable(false);
			btnGuess1.setDisable(true);
			btnGuess2.setDisable(false);
			
			//set background to black 
			hbChoices1.setStyle("-fx-background-color: black");		
			
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
			
		}else
		{
			majorButtonClick("invalid");
		}
		
		//check for win

		
		
	}
	
	private void btnGuess2_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg5.getValue() == null || choicePeg6.getValue() == null || 
				choicePeg7.getValue() == null || choicePeg8.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg5.getValue(), choicePeg6.getValue(), 
				choicePeg7.getValue(), choicePeg8.getValue()};
			
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed2.setText(Integer.toString(pegs[0]));
			tfWhite2.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg5.setDisable(true);	//disable row 2
			choicePeg6.setDisable(true);
			choicePeg7.setDisable(true);
			choicePeg8.setDisable(true);
			choicePeg9.setDisable(false);	//enable row 3
			choicePeg10.setDisable(false);
			choicePeg11.setDisable(false);
			choicePeg12.setDisable(false);
			btnGuess2.setDisable(true);
			btnGuess3.setDisable(false);
			hbChoices2.setStyle("-fx-background-color: black");
			
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}

	private void btnGuess3_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg9.getValue() == null || choicePeg10.getValue() == null || 
				choicePeg11.getValue() == null || choicePeg12.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg9.getValue(), choicePeg10.getValue(), 
				choicePeg11.getValue(), choicePeg12.getValue()};
			
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed3.setText(Integer.toString(pegs[0]));
			tfWhite3.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg9.setDisable(true);	//disable row 3
			choicePeg10.setDisable(true);
			choicePeg11.setDisable(true);
			choicePeg12.setDisable(true);
			choicePeg13.setDisable(false);	//enable row 4
			choicePeg14.setDisable(false);
			choicePeg15.setDisable(false);
			choicePeg16.setDisable(false);
			btnGuess3.setDisable(true);
			btnGuess4.setDisable(false);
			hbChoices3.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}

	private void btnGuess4_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg13.getValue() == null || choicePeg14.getValue() == null || 
				choicePeg15.getValue() == null || choicePeg16.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg13.getValue(), choicePeg14.getValue(), 
				choicePeg15.getValue(), choicePeg16.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed4.setText(Integer.toString(pegs[0]));
			tfWhite4.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg13.setDisable(true);	//disable row 4
			choicePeg14.setDisable(true);
			choicePeg15.setDisable(true);
			choicePeg16.setDisable(true);
			choicePeg17.setDisable(false);	//enable row 5
			choicePeg18.setDisable(false);
			choicePeg19.setDisable(false);
			choicePeg20.setDisable(false);
			btnGuess4.setDisable(true);
			btnGuess5.setDisable(false);
			hbChoices4.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}

	private void btnGuess5_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg17.getValue() == null || choicePeg18.getValue() == null || 
				choicePeg19.getValue() == null || choicePeg20.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg17.getValue(), choicePeg18.getValue(), 
				choicePeg19.getValue(), choicePeg20.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed5.setText(Integer.toString(pegs[0]));
			tfWhite5.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg17.setDisable(true);	//disable row 5
			choicePeg18.setDisable(true);
			choicePeg19.setDisable(true);
			choicePeg20.setDisable(true);
			choicePeg21.setDisable(false);	//enable row 6
			choicePeg22.setDisable(false);
			choicePeg23.setDisable(false);
			choicePeg24.setDisable(false);
			btnGuess5.setDisable(true);
			btnGuess6.setDisable(false);
			hbChoices5.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}

	private void btnGuess6_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg21.getValue() == null || choicePeg22.getValue() == null || 
				choicePeg23.getValue() == null || choicePeg24.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg21.getValue(), choicePeg22.getValue(), 
				choicePeg23.getValue(), choicePeg24.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed6.setText(Integer.toString(pegs[0]));
			tfWhite6.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg21.setDisable(true);	//disable row 6
			choicePeg22.setDisable(true);
			choicePeg23.setDisable(true);
			choicePeg24.setDisable(true);
			choicePeg25.setDisable(false);	//enable row 7
			choicePeg26.setDisable(false);
			choicePeg27.setDisable(false);
			choicePeg28.setDisable(false);
			btnGuess6.setDisable(true);
			btnGuess7.setDisable(false);
			hbChoices6.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
		
	}

	private void btnGuess7_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg25.getValue() == null || choicePeg26.getValue() == null || 
				choicePeg27.getValue() == null || choicePeg28.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg25.getValue(), choicePeg26.getValue(), 
				choicePeg27.getValue(), choicePeg28.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed7.setText(Integer.toString(pegs[0]));
			tfWhite7.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg25.setDisable(true);	//disable row 7
			choicePeg26.setDisable(true);
			choicePeg27.setDisable(true);
			choicePeg28.setDisable(true);
			choicePeg29.setDisable(false);	//enable row 8
			choicePeg30.setDisable(false);
			choicePeg31.setDisable(false);
			choicePeg32.setDisable(false);
			btnGuess7.setDisable(true);
			btnGuess8.setDisable(false);
			hbChoices7.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}

	private void btnGuess8_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg29.getValue() == null || choicePeg30.getValue() == null || 
				choicePeg31.getValue() == null || choicePeg32.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg29.getValue(), choicePeg30.getValue(), 
				choicePeg31.getValue(), choicePeg32.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed8.setText(Integer.toString(pegs[0]));
			tfWhite8.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg29.setDisable(true);	//disable row 8
			choicePeg30.setDisable(true);
			choicePeg31.setDisable(true);
			choicePeg32.setDisable(true);
			choicePeg33.setDisable(false);	//enable row 9
			choicePeg34.setDisable(false);
			choicePeg35.setDisable(false);
			choicePeg36.setDisable(false);
			btnGuess8.setDisable(true);
			btnGuess9.setDisable(false);
			hbChoices8.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}

	private void btnGuess9_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg33.getValue() == null || choicePeg34.getValue() == null || 
				choicePeg35.getValue() == null || choicePeg36.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg33.getValue(), choicePeg34.getValue(), 
				choicePeg35.getValue(), choicePeg36.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed9.setText(Integer.toString(pegs[0]));
			tfWhite9.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg33.setDisable(true);	//disable row 9
			choicePeg34.setDisable(true);
			choicePeg35.setDisable(true);
			choicePeg36.setDisable(true);
			choicePeg37.setDisable(false);	//enable row 10
			choicePeg38.setDisable(false);
			choicePeg39.setDisable(false);
			choicePeg40.setDisable(false);
			btnGuess9.setDisable(true);
			btnGuess10.setDisable(false);
			hbChoices9.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}
		}else
		{
			majorButtonClick("invalid");
		}
				
			
	}

	private void btnGuess10_Click()
	{
		//check for null values at rows 1 pegs
		boolean condition = true;
		
		if (choicePeg37.getValue() == null || choicePeg38.getValue() == null || 
				choicePeg39.getValue() == null || choicePeg40.getValue() == null)
		{
			condition = false;
		}
		
		if (condition)
		{		
			//get the selections
			String[] gatheredChoices = new String[]{choicePeg33.getValue(), choicePeg34.getValue(), 
				choicePeg35.getValue(), choicePeg36.getValue()};
	
			//put first char of selections into array
			for (int i = 0; i < 4; i++)
			{
				playerGuess[i] = gatheredChoices[i].charAt(0);
			}
			 
			//grade guess
			int[] pegs = Generate.gradeGuess(playerGuess, charTarget);
					
			//print the peg values
			tfRed10.setText(Integer.toString(pegs[0]));
			tfWhite10.setText(Integer.toString(pegs[1]));
			
			//disable and enable buttons to move game play
			choicePeg37.setDisable(true);	//disable row 10
			choicePeg38.setDisable(true);
			choicePeg39.setDisable(true);
			choicePeg40.setDisable(true);
			btnGuess10.setDisable(true);
			btnStart.setDisable(false);
			hbChoices10.setStyle("-fx-background-color: black");
			//check for win
			if (pegs[0] == 4)
			{
				majorButtonClick("win");
			}else
			{
				majorButtonClick("loss");
			}
		}else
		{
			majorButtonClick("invalid");
		}
	}
	
	//changes background of the choice box depending on selection
    private void choicePeg_colorChange(ChoiceBox<String> choicePegs) 
    {    	
		String choice = choicePegs.getSelectionModel().getSelectedItem();
		if (choice != null) 
		{
            String color = choice.toLowerCase();
            choicePegs.setStyle("-fx-base: "+color+"; -fx-control-inner-background: -fx-base ;");
		}    	
    }    
    
    public static void resetProcedure()
    {
    	//set all background colors back to white
    	hbChoices1.setStyle("-fxbackground-color: white");
    	hbChoices2.setStyle("-fxbackground-color: white");
    	hbChoices3.setStyle("-fxbackground-color: white");
    	hbChoices4.setStyle("-fxbackground-color: white");
    	hbChoices5.setStyle("-fxbackground-color: white");
    	hbChoices6.setStyle("-fxbackground-color: white");
    	hbChoices7.setStyle("-fxbackground-color: white");
    	hbChoices8.setStyle("-fxbackground-color: white");
    	hbChoices9.setStyle("-fxbackground-color: white");
    	hbChoices10.setStyle("-fxbackground-color: white");
    	
    	//reset all choiceBoxes
    	choicePeg1.setValue(null); choicePeg2.setValue(null); choicePeg3.setValue(null); choicePeg4.setValue(null); 
    	choicePeg5.setValue(null); choicePeg6.setValue(null); choicePeg7.setValue(null); choicePeg8.setValue(null); 
    	choicePeg9.setValue(null); choicePeg10.setValue(null); choicePeg11.setValue(null); choicePeg12.setValue(null); 
    	choicePeg13.setValue(null); choicePeg14.setValue(null); choicePeg15.setValue(null); choicePeg16.setValue(null); 
    	choicePeg17.setValue(null); choicePeg18.setValue(null); choicePeg19.setValue(null); choicePeg20.setValue(null); 
    	choicePeg21.setValue(null); choicePeg22.setValue(null); choicePeg23.setValue(null); choicePeg24.setValue(null); 
    	choicePeg25.setValue(null); choicePeg26.setValue(null); choicePeg27.setValue(null); choicePeg28.setValue(null); 
    	choicePeg29.setValue(null); choicePeg30.setValue(null); choicePeg31.setValue(null); choicePeg32.setValue(null); 
    	choicePeg33.setValue(null); choicePeg34.setValue(null); choicePeg35.setValue(null); choicePeg36.setValue(null); 
    	choicePeg37.setValue(null); choicePeg38.setValue(null); choicePeg39.setValue(null); choicePeg40.setValue(null); 
    	
    	//set all choiceBoxes to disable
    	choicePeg1.setDisable(true); choicePeg2.setDisable(true); choicePeg3.setDisable(true); choicePeg4.setDisable(true); 
    	choicePeg5.setDisable(true); choicePeg6.setDisable(true); choicePeg7.setDisable(true); choicePeg8.setDisable(true); 
    	choicePeg9.setDisable(true); choicePeg10.setDisable(true); choicePeg11.setDisable(true); choicePeg12.setDisable(true); 
    	choicePeg13.setDisable(true); choicePeg14.setDisable(true); choicePeg15.setDisable(true); choicePeg16.setDisable(true); 
    	choicePeg17.setDisable(true); choicePeg18.setDisable(true); choicePeg19.setDisable(true); choicePeg20.setDisable(true); 
    	choicePeg21.setDisable(true); choicePeg22.setDisable(true); choicePeg23.setDisable(true); choicePeg24.setDisable(true); 
    	choicePeg25.setDisable(true); choicePeg26.setDisable(true); choicePeg27.setDisable(true); choicePeg28.setDisable(true); 
    	choicePeg29.setDisable(true); choicePeg30.setDisable(true); choicePeg31.setDisable(true); choicePeg32.setDisable(true); 
    	choicePeg33.setDisable(true); choicePeg34.setDisable(true); choicePeg35.setDisable(true); choicePeg36.setDisable(true); 
    	choicePeg37.setDisable(true); choicePeg38.setDisable(true); choicePeg39.setDisable(true); choicePeg40.setDisable(true); 
    	
    	//set red and white
    	tfRed1.clear(); tfWhite1.clear();
    	tfRed2.clear(); tfWhite2.clear();
    	tfRed3.clear(); tfWhite3.clear();
    	tfRed4.clear(); tfWhite4.clear();
    	tfRed5.clear(); tfWhite5.clear();
    	tfRed6.clear(); tfWhite6.clear();
    	tfRed7.clear(); tfWhite7.clear();
    	tfRed8.clear(); tfWhite8.clear();
    	tfRed9.clear(); tfWhite9.clear();
    	tfRed10.clear(); tfWhite10.clear();
    	
    	//disable all guess buttons
    	btnGuess1.setDisable(true);
    	btnGuess2.setDisable(true);
    	btnGuess3.setDisable(true);
    	btnGuess4.setDisable(true);
    	btnGuess5.setDisable(true);
    	btnGuess6.setDisable(true);
    	btnGuess7.setDisable(true);
    	btnGuess8.setDisable(true);
    	btnGuess9.setDisable(true);
    	btnGuess10.setDisable(true);
    	
    	//activate start button
    	btnStart.setDisable(false);   
    	
    	//display correct answer in message box    
    	tfInstructions.setText("Start a new game?");
    	
    }

    public void setChoicesBackgroundWhite()
    {    	
    	choicePeg1.setStyle("-fx-base: white"); choicePeg2.setStyle("-fx-base: white"); choicePeg3.setStyle("-fx-base: white"); choicePeg4.setStyle("-fx-base: white"); 
    	choicePeg5.setStyle("-fx-base: white"); choicePeg6.setStyle("-fx-base: white"); choicePeg7.setStyle("-fx-base: white"); choicePeg8.setStyle("-fx-base: white"); 
    	choicePeg9.setStyle("-fx-base: white"); choicePeg10.setStyle("-fx-base: white"); choicePeg11.setStyle("-fx-base: white"); choicePeg12.setStyle("-fx-base: white"); 
    	choicePeg13.setStyle("-fx-base: white"); choicePeg14.setStyle("-fx-base: white"); choicePeg15.setStyle("-fx-base: white"); choicePeg16.setStyle("-fx-base: white"); 
    	choicePeg17.setStyle("-fx-base: white"); choicePeg18.setStyle("-fx-base: white"); choicePeg19.setStyle("-fx-base: white"); choicePeg20.setStyle("-fx-base: white"); 
    	choicePeg21.setStyle("-fx-base: white"); choicePeg22.setStyle("-fx-base: white"); choicePeg23.setStyle("-fx-base: white"); choicePeg24.setStyle("-fx-base: white"); 
    	choicePeg25.setStyle("-fx-base: white"); choicePeg26.setStyle("-fx-base: white"); choicePeg27.setStyle("-fx-base: white"); choicePeg28.setStyle("-fx-base: white"); 
    	choicePeg29.setStyle("-fx-base: white"); choicePeg30.setStyle("-fx-base: white"); choicePeg31.setStyle("-fx-base: white"); choicePeg32.setStyle("-fx-base: white"); 
    	choicePeg33.setStyle("-fx-base: white"); choicePeg34.setStyle("-fx-base: white"); choicePeg35.setStyle("-fx-base: white"); choicePeg36.setStyle("-fx-base: white"); 
    	choicePeg37.setStyle("-fx-base: white"); choicePeg38.setStyle("-fx-base: white"); choicePeg39.setStyle("-fx-base: white"); choicePeg40.setStyle("-fx-base: white");
    	
    }
    
    private void majorButtonClick(String type)
    {
    	if (type.equals("loss"))
    	{
    		String winningCode = new String(charTarget);
    		Alert alert = new Alert(Alert.AlertType.INFORMATION, "you have lost the game. Winning Code: "
    				+ winningCode);
    		    		
    		alert.showAndWait();
    		
    		resetProcedure();
    		
    	}else if (type.equals("win"))
    	{
    		Alert alert = new Alert(Alert.AlertType.INFORMATION, "You have won the game!");
    		
    		alert.showAndWait();
    		
    		resetProcedure();
    		
    	}else if (type.contentEquals("end"))
    	{
    		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to quit this game?");
    		
    		Optional<ButtonType> result = alert.showAndWait();
    		if (!result.isPresent())
    		{
    			//do nothing is alert is closed not by a button
    		}else if (result.get() == ButtonType.OK)
    		{
    			resetProcedure();
    		}
    		
    	}else if (type.equals("invalid"))
    	{
    		Alert alert = new Alert(Alert.AlertType.WARNING, "You must select colors for all four pegs");
    		
    		alert.showAndWait();
    	}    		    
    }
}
