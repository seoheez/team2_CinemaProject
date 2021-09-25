package sign.loginService;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;
import sign.member_dto.MemberDTO;

public class LoginServiceImpl implements LoginService{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
		
	@Override
	public void loginClose() {
		System.out.println("화면을 닫겠습니다");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}

	public void alertMethod(String msg) {
		Alert alert =new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
		}

	@Override
	public void loginCheck(Parent root) {
		// TODO Auto-generated method stub
		
	}
}
		
	
