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
		System.out.println("�α���");
		TextField tf = (TextField)root.lookup("#fxId");
		PasswordField pf = (PasswordField)root.lookup("#fxPwd");
		System.out.println(tf.getText());
		System.out.println(pf.getText());
	}
	@Override
	public void loginClose() {
		System.out.println("ȭ���� �ݰڽ��ϴ�~");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	
}
