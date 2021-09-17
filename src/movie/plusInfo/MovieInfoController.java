package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MovieInfoController implements Initializable{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void detailView(ActionEvent view) {
		System.out.println(((Button)(view.getSource())).getId());
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("0번째 줄거리");
		arr.add("1번째 줄거리");
		ArrayList<String> btn = new ArrayList<String>();
		btn.add("detail0");
		btn.add("detail1");
		System.out.println(btn.indexOf(((Button)(view.getSource())).getId()));
		Zero(arr.get(btn.indexOf(((Button)(view.getSource())).getId())));
	}

	public void Zero(String s){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo0.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller0 ctl = loader.getController();
			ctl.setRoot(Root,s);
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
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo1.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller1 ctl1 = loader.getController();
			ctl1.setRoot(Root);
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
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo2.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller2 ctl = loader.getController();
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
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo3.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller3 ctl = loader.getController();
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
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo4.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller4 ctl = loader.getController();
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
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo5.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller5 ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void reserveBtn(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/movie/plusInfo/plusInfo.fxml"));
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
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}