package Main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import movie.plusInfo.MovieInfoController;
import sign.loginService.LoginService;
import sign.loginService.LoginServiceImpl;
import sign.member.MemberProc;

public class Controller implements Initializable{
	@FXML
	ImageView myImageView; 
	Image myImage = new Image(getClass().getResourceAsStream("/img/movie.jpg"));

	
	Parent root;
	MemberProc mp;
	LoginService ls;

	public void setRoot(Parent root) {
		this.root = root;
		ls.setRoot(root);
	}

	public void btnOk() {
		TextField id = (TextField)root.lookup("#fxId");
		TextField pwd = (TextField)root.lookup("#fxPwd");
		if(id.getText().isEmpty()) {
			alertMethod("아이디는 필수 항목입니다");
			id.requestFocus();
			return;
		}
		else if(pwd.getText().isEmpty()) {
			alertMethod("비번은 필수 항목입니다");
			return;
		}
		
		//ls.loginCheck();
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
	public void btnCancel() {
		//System.out.println("can");
		ls.loginClose();
	}
	public void btnMemberShip() {
		//System.out.println("mem");
		mp.memberShip();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp = new MemberProc();
		ls = new LoginServiceImpl();
	}
	public void displayImage() {
		myImageView.setImage(myImage);
	}
	public void alertMethod(String msg) {
		Alert alert =new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
		}
}