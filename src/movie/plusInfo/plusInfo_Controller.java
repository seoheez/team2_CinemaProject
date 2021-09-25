package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import CheckPage.check_Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;

public class plusInfo_Controller implements Initializable{
	Parent root;
	
	ListView<String> fxListView;
	ImageView fxImageView;
	ObservableList<String> movieTitle;
	ArrayList<String> url;
	
	ComboBox<String> cmbTitle;
	ComboBox<String> cmbTime;
	ComboBox<String> cmbCount;
	DatePicker fxDate;
	
	String num;
	public void setRoot(Parent root) {
		this.root = root;
		addComboTitle();
		addComboTime();
		addComboCount();
		fxListView = (ListView)root.lookup("#fxListView");
		fxImageView = (ImageView)root.lookup("#fxImageView");
		
		fxDate=(DatePicker)root.lookup("#fxDate");
		
		setListView();
	}


	public void addComboTitle() {
		// TODO Auto-generated method stub
		 cmbTitle = (ComboBox<String>)root.lookup("#cmbTitle");
		if(cmbTitle != null) {
			cmbTitle.getItems().addAll("샹치", "인질", "포켓몬스터", "모가디슈", "건파우더 밀크쉐이크", "맨인 더 다크2");

		}

		
	}
	public void addComboTime() {
		// TODO Auto-generated method stub
		cmbTime = (ComboBox<String>)root.lookup("#cmbTime");
		if(cmbTime != null) {
			cmbTime.getItems().addAll("Am 10:00", "Pm 1:00", "Pm 4:00");
		}
		
		
	}
	public void addComboCount() {
		// TODO Auto-generated method stub
		cmbCount = (ComboBox<String>)root.lookup("#cmbCount");
		if(cmbCount != null) {
			cmbCount.getItems().addAll("1", "2", "3", "4", "5");
		}
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

	public void InfoBtn() {

		
		if(cmbTitle.getValue() == null || cmbTime.getValue() == null || cmbCount.getValue() == null || fxDate.getValue()== null) {
			
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("경고창");
			alert.setHeaderText("경고!!");
			alert.setContentText("다음으로 넘어가기 전에 모두 선택하세요!");
			alert.showAndWait();
		}
		
		System.out.println(cmbTitle.getValue());
		System.out.println(cmbTime.getValue());
		System.out.println(cmbCount.getValue());
		System.out.println(fxDate.getValue());
		
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/CheckPage/checkPage.fxml")); 
			Parent root = loader.load();
			Scene scene = new Scene(root);
			check_Controller ctl = loader.getController();
			ctl.setRoot(root,cmbTitle.getValue(),cmbTime.getValue(),cmbCount.getValue(),fxDate.getValue().toString(),num);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//CommonService cs = new CommonServiceImpl();
		//cs.setRoot(root);
		//cs.windowClose();
	}
	
	
	public void preBtn() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/movie/plusInfo/MovieInfo.fxml")); 
			Parent root = loader.load();
			Scene scene = new Scene(root);
			MovieInfoController ctl = loader.getController();
			ctl.setRoot(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	

	}
	public void setNum(ActionEvent e) {
		System.out.println( ((Button)e.getSource()).getText() );
		num = ((Button)e.getSource()).getText();
	}
}





