package CheckPage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;
import sign.loginService.LoginService;
import sign.member.MemberProc;

public class check_Controller implements Initializable{
	Parent root;
	@FXML private Button payBtn;



	public void setRoot(Parent root) {
		this.root = root;

	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	public void payBtn( ) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("결제가 완료되었습니다!\n즐거운 관람되세요~!!");
		alert.show();
	}
	public void endBtn() {
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}



}
