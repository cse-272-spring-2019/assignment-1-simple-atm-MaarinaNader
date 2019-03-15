import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class bank extends Application{
	
	public static void main (String[]args) {
		launch(args);
	}



	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ATM");
		Third third = new Third(primaryStage);
		Fourth fourth = new Fourth(primaryStage);
		Fifth fifth = new  Fifth(primaryStage);
		Sixth sixth=new Sixth(primaryStage);
		GUI gui= new GUI(primaryStage);
		HomeScreen homeScreen= new HomeScreen(primaryStage);
		
		gui.prepareScene();
		homeScreen.prepareScene();
		third.prepareScene();
		fourth.prepareScene();
		fifth.prepareScene();
		sixth.prepareScene();
		
		gui.setHomeScreen(homeScreen);
		homeScreen.setThird(third);
		homeScreen.setFourth(fourth);
		homeScreen.setFifth(fifth);
		homeScreen.setSixth(sixth);
		third.setHomeScreen(homeScreen);
		fourth.setHomeScreen(homeScreen);
		fifth.setHomeScreen(homeScreen);
		sixth.setHomeScreen(homeScreen);
		
		
		   primaryStage.setScene(gui.getScene());
		   
			primaryStage.show();
		
	}

}
