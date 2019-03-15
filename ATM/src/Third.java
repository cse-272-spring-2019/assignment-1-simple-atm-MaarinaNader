import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Third {
	Account acc=new Account(0.0,"123789");	
	Scene scene;
	GUI gui;
	Stage stage;
	HomeScreen homeScreen;
	
	public Third(Stage stage) {
		this.stage=stage;
	}
	public Third() {
		Account.getBalance();
	}

	  

	public void prepareScene() {
		 Label deposite=new Label("Enter Deosite Amount");	
		 TextField Dep= new TextField();
		 Button submit7 = new Button ("Done");
		 
		 GridPane grid= new GridPane();
		   grid.add(deposite, 0, 0);
		   grid.add(Dep, 1, 0);
		   grid.add(submit7, 0, 2);
		   

		   submit7.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					
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