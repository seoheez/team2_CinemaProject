package movie.plusInfo;

import java.io.IOException;

import Main.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MovieInfo extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("MovieInfo.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		MovieInfoController ctl = loader.getController();
		ctl.setRoot(root);
		primaryStage.setTitle("Movie Reservation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}