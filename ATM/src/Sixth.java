import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sixth {
	Scene scene;
	GUI gui;
	Stage stage;
	HomeScreen homeScreen;
	public Sixth(Stage stage) {
		this.stage=stage;
	}
	public Scene getScene() {
		return scene;
	}
	public void setHomeScreen(HomeScreen homeScreen) {
		this.homeScreen=homeScreen;
	}
	public void prepareScene() {
		 GridPane grid= new GridPane();
		 Button submit10 = new Button ("Done");
		 grid.add(submit10, 0, 2);
		 submit10.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					
					stage.setScene(homeScreen.getScene());
				}
			});  

		 
		 scene = new Scene(grid,500,500);
	}
	
}

