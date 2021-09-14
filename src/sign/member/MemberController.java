package sign.member;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;
import sign.member_dto.MemberDTO;

public class MemberController implements Initializable{
	Parent root;
	MemberService ms;
	public void setRoot(Parent root) {
		this.root = root;
		ms.setRoot(root);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ms = new MemberServiceImpl();
	}
	public void membershipProc() {
		System.out.println("ȸ������ Ŭ��");
		ms.membershipProc();
	}
	public void memberCancle() {
		System.out.println("��� Ŭ��");
		ms.memberCancle();
	}
}





