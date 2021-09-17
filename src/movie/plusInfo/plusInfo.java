package movie.plusInfo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class plusInfo extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("/movie.plusInfo/plusInfo.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		plusInfo_Controller ctl = loader.getController();
		ctl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
