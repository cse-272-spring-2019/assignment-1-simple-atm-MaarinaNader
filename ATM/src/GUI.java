
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GUI {
	bank Bank;
	Scene scene;
	Handler handler;
	Stage stage;
    HomeScreen homeScreen;
    GUI gui;
	
	public GUI(Stage stage) {
		this.stage=stage;
	}

	public void prepareScene() {
		handler= new Handler();
		
	   Label CardNumberLabel=new Label("Card Number");
	   PasswordField passwordField=new PasswordField();
	   Button submit = new Button ("Enter");
	   Label validationLabel = new Label();
	   
	   GridPane grid= new GridPane();
	   grid.add(CardNumberLabel, 0, 0);
	   grid.add(passwordField, 0, 1);
	   grid.add(submit, 0, 2);
	   grid.add(validationLabel, 0, 3);
	   
	    
	submit.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			String CardNumber = passwordField.getText()	;
		    boolean valid =handler.validate(CardNumber);
			if (valid) {
				validationLabel.setText("welome");
				stage.setScene(homeScreen.getScene());
				
			}else {
				validationLabel.setText("Error!invalid card number");
			}
		}		  	
	});
	   
 scene =new Scene(grid , 500, 500);  
		
	}
	public Scene getScene() {
		return this.scene;
	}
	public void setHomeScreen (HomeScreen homeScreen){
		this.homeScreen=homeScreen;
	}

}
