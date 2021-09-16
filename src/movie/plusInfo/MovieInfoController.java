package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MovieInfoController implements Initializable{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void detailView0(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo0.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void detailView1(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo1.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void detailView2(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo2.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	
	
	public void detailView3(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo3.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	
	
	public void detailView4(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo4.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
	
	
	public void detailView5(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo5.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reserveBtn0() {
	try {
		Stage primaryStage = new Stage();
		FXMLLoader loader = 
				new FXMLLoader(getClass().getResource(".fxml"));
		Parent Root = loader.load();
		Scene scene = new Scene(Root);
		plusInfo_Controller ctl = loader.getController();
		ctl.setRoot(Root);
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch (Exception e) {
		e.printStackTrace();
	}	
}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}