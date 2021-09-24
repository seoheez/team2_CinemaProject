package sign.member;

import Main.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;
import sign.member_dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	Parent root;
	public void addComboBox() {
	}
	
	public void memberCancle() {
		System.out.println("취소 클릭");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	public void check() {
		TextField ax = (TextField)root.lookup("#fxName");
		TextField bf = (TextField)root.lookup("#fxID");
		TextField cf = (TextField)root.lookup("#fxPw");
		TextField df = (TextField)root.lookup("#fxPwOk");
		if(ax.getText().isEmpty()) {
			alertMethod("이름은 필수 항목입니다");
			ax.requestFocus();
		}
		else if(bf.getText().isEmpty()) {
			alertMethod("아이디는 필수 항목입니다");
		}
		else if(cf.getText().isEmpty()) {
			alertMethod("비밀번호는 필수 입력사항입니다");
		}
	}
	public void alertMethod(String msg) {
		Alert alert =new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
	@Override
	public void membershipProc() {
		MemberDTO dto = new MemberDTO();

		check();

		dto.setName( ((TextField)root.lookup("#fxName")).getText() );

		System.out.println( dto.getName() );
	}
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
}
