package CheckPage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import movie.plusInfo.MovieInfoController;
import movie.plusInfo.plusInfo_Controller;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;
import javafx.scene.control.Label;
import sign.loginService.LoginService;
import sign.member.MemberProc;

public class check_Controller implements Initializable{
	Parent root;
	@FXML private Button payBtn;

	public void setRoot(Parent root) {
		this.root = root;
	}
	Label fxTitle, fxDate, fxTime, fxTheater, fxSNum ;
	public void setRoot(Parent root,String title, String time,  String theater, String date,   String num) {
		this.root = root;
		fxTitle = (Label)root.lookup("#fxTitle");
		fxDate = (Label)root.lookup("#fxDate");
		fxTheater = (Label)root.lookup("#fxTheater");
		fxTime = (Label)root.lookup("#fxTime");
		fxSNum	 = (Label)root.lookup("#fxSNum");
		fxTitle.setText(title);
		fxDate.setText(date);
		fxTheater.setText(theater);
		fxTime.setText(time);
		fxSNum.setText(num);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	public void payBtn( ) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("결제가 완료되었습니다!\n즐거운 관람되세요~!!");
		alert.show();
		
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
		
	}
	public void endBtn() {
		Boolean answer = checkConfirmBox.display("Title", "정말 종료하시겠습니까?");
		if (answer) {
			System.out.println("종료합니다.");
			Stage stage = (Stage)root.getScene().getWindow();
			stage.close();

		} else {
			System.out.println("종료하지 않습니다.");
		}
	}

	public void preBtn() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/movie/plusInfo/plusInfo.fxml")); 
			Parent root = loader.load();
			Scene scene = new Scene(root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}


}
