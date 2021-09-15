package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
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
	//ObservableList<Phone> phoneURL;
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
			fxImageView.setImage(new Image("/img/movie"+ url.get( (int)newValue )) );
		});
	}
	public void setList() {
		movieTitle = FXCollections.observableArrayList();
		url = new ArrayList<String>();
		for(int i=1 ; i<2 ; i++) {
		movieTitle.add("샹치");
		movieTitle.add("인질");
		movieTitle.add("포켓몬스터 :정글의 아이,코코");
		movieTitle.add("모가디슈");
		movieTitle.add("컨파우더 밀크셰이크");
		movieTitle.add("맨인더다크2");
		url.add("영화"+".png");
	}
	fxListView.setItems(movieTitle);
}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {	}
}





