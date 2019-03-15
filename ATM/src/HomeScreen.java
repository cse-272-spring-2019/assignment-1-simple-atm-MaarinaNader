import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeScreen {
Scene scene;
GUI gui;
Stage stage;
Third third;
Fourth fourth;
Fifth fifth;
Sixth sixth;

public HomeScreen(Stage stage) {
	this.stage=stage;
}

public void prepareScene() {
	
	   Label welcome=new Label("Choose a number:");
	   Button submit = new Button ("1)Deposit");
	   Button submit1 = new Button ("2)Withdraw");
	   Button submit2= new Button ("3)Balance Inquiry");
	   Button submit3= new Button ("4)Previous&Next");
	  
  
	   GridPane grid= new GridPane();
	   grid.add(welcome, 0, 0);
	   grid.add(submit, 0, 1);
	   grid.add(submit1, 0, 2);
	   grid.add(submit2, 0, 3);
	   grid.add(submit3, 0, 4);
	  

	    

	   submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				stage.setScene(third.getScene());
			}
		});  
	   
	   submit1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				stage.setScene(fourth.getScene());
			}
			});
	   submit2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				stage.setScene(fifth.getScene());
			}
			});
	   
	   submit3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				stage.setScene( sixth.getScene());
			}
			});
	   
	   scene = new Scene(grid,500,500);

}

public Scene getScene() {
	return scene;
}

public void setGUI(GUI gui) {
	this.gui=gui;
}
 public void setThird(Third third) {
	 this.third=third;
 }

public void setFourth(Fourth fourth) {
	this.fourth=fourth;
	
}
public void setFifth(Fifth fifth) {
	this.fifth=fifth;
	
}
public void setSixth(Sixth sixth) {
	this.sixth=sixth;
	
}
}
