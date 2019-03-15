import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fifth {
	Scene scene;
	GUI gui;
	Stage stage;
	HomeScreen homeScreen;
	public Fifth(Stage stage) {
		this.stage=stage;
	}
	
	public void setHomeScreen(HomeScreen homeScreen) {
		this.homeScreen=homeScreen;
	}
	public void prepareScene() {
		 GridPane grid= new GridPane();
		 Button submit9 = new Button ("Done");

		 grid.add(submit9, 0, 2);
		 
		 submit9.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					stage.setScene(homeScreen.getScene());
				}
			});  

		 scene = new Scene(grid,500,500);
	}
	public Scene getScene() {
		return scene;
	}

}
