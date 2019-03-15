import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fourth {
	 private double Balance = 0;
	Account acc=new Account(0.0,"123789");	
	Scene scene;
	GUI gui;
	Stage stage;
	HomeScreen homeScreen;
	Account withdraw=new Account(0.0, "123789");
	
	public Fourth(Stage stage) {
		this.stage=stage;
	}
	 
	public void prepareScene() {
		 Label withdraw=new Label("Enter Withwrawal Amount");	
		 TextField W= new TextField();
		 Label validationLabel = new Label();

		 Button submit8 = new Button ("Done");

		 GridPane grid= new GridPane();
		   grid.add(withdraw, 0, 0);
		   grid.add(W, 1, 0);
		   grid.add(submit8, 0, 2);
		   grid.add(validationLabel, 0, 3);
		   
		   submit8.setOnAction(new EventHandler<ActionEvent>() {	
			   public void handle(ActionEvent arg0) {
				double amount= Double.parseDouble(W.getText());
				if (amount>Account.getBalance()) {
								validationLabel.setText("Error!insuuficient funds");
						    }
								
						
				
						stage.setScene(homeScreen.getScene());
				} 
			});  

			
		   scene = new Scene(grid,500,500);

}
	public void setHomeScreen(HomeScreen homeScreen) {
		this.homeScreen=homeScreen;
	}

	public Scene getScene() {
		return scene;
	}
}
