package cis232.classlab;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CoinApplication extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Load the FXML into a parent
		Parent parent = FXMLLoader.load(getClass().getResource("CoinFlipper.fxml"));
		
		//Set a scene with the parent/root
		Scene scene = new Scene(parent);
		
		//Add the scene to the stage
		stage.setScene(scene);
		
		//Show the stage
		stage.show();
	}
	
	
}
