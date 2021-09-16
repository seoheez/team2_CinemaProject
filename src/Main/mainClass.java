package Main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class mainClass extends Application {
	public static int s = 0;
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("eventTest.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Controller ctl = loader.getController();
		ctl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}