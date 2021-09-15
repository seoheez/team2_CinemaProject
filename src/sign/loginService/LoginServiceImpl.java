package sign.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;

public class LoginServiceImpl implements LoginService{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void loginCheck() {
		System.out.println("로그인 성공");
		TextField tf = (TextField)root.lookup("#fxId");
		PasswordField pf = (PasswordField)root.lookup("#fxPwd");
		System.out.println(tf.getText());
		System.out.println(pf.getText());
	}
	@Override
	public void loginClose() {
		System.out.println("화면을 닫겠습니다");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	
}
