package movie.plusInfo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class detailInfo1 extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource("datailInfo1.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		datail_Info_Controller1 ctl = loader.getController();
		ctl.setRoot(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}