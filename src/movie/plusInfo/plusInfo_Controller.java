package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class plusInfo_Controller implements Initializable{
	Parent root;
	ListView<String> fxListView;
	ImageView fxImageView;
	ObservableList<String> movieTitle;
	ArrayList<String> url;
	public void setRoot(Parent root) {
		this.root = root;
		fxListView = (ListView)root.lookup("#fxListView");
		fxImageView = (ImageView)root.lookup("#fxImageView");
		setListView();
	}
	
	
	public void setListView() {
		setList();
		fxListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue)->{
			System.out.println("observable(형식) : "+observable);
			System.out.println("oldValue(이전값) : "+oldValue);
			System.out.println("newValue(현재값) : "+newValue);
			System.out.println(movieTitle.get( (int)newValue ));
			System.out.println("/img/movie/"+ url.get( (int)newValue));
			System.out.println(url.size());
			fxImageView.setImage(new Image("/img/movie/"+ url.get( (int)newValue )) );
		});
	}
	public void setList() {
		movieTitle = FXCollections.observableArrayList();
		url = new ArrayList<String>();
		String[] title = {"샹치","인질","포켓몬스터 :정글의 아이,코코","모가디슈","컨파우더 밀크셰이크","맨인더다크2"};
		for(int i=0 ; i<title.length; i++) {
		movieTitle.add(title[i]);
	
		url.add("movie"+ i + ".jpg");
	}
	fxListView.setItems(movieTitle);
}
	/*
	public void reserveBtn() {
			try {
				Stage primaryStage = new Stage();
				FXMLLoader loader = 
						new FXMLLoader(getClass().getResource("MovieInfo.fxml"));
				Parent Root = loader.load();
				Scene scene = new Scene(Root);
				//plusInfo_Controller ctl = loader.getController();
				//ctl.setRoot(Root);
				Stage stage = (Stage)root.getScene().getWindow();
				stage.close();
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		*/
	/*
	public void detailView() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			//plusInfo_Controller ctl = loader.getController();
			//ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
@Override
public void initialize(URL arg0, ResourceBundle arg1) {	}
}





