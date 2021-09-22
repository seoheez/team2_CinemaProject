package sign.loginService;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;

public class LoginServiceImpl implements LoginService{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void loginCheck() {
		TextField tf = (TextField)root.lookup("#fxId");
		PasswordField pf = (PasswordField)root.lookup("#fxPwd");
		 
		if(!tf.getText().isEmpty()&&
				!pf.getText().isEmpty()) {
			alertMethod("아이디는 필수 항목입니다");
		}
	}
	
	public void alertMethod(String msg) {
		Alert alert =new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
		}
	@Override
	public void loginClose() {
		System.out.println("화면을 닫겠습니다");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	
}
