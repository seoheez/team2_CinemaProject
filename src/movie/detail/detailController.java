package movie.detail;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class detailController implements Initializable{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void detailView() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			detailController ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
