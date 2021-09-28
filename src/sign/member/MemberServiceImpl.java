package sign.member;

import java.util.ResourceBundle;

import Main.Controller;
import Main.DB;
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
import sign.loginService.LoginService;
import sign.member_dto.MemberDTO;

public class MemberServiceImpl implements MemberService{
	Parent root;
	DB db;

	public void addComboBox() {
		db = new DB();
	}
	
	public void memberCancle() {
		System.out.println("취소 클릭");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	
	@Override
	public void membershipProc() {
		TextField name = (TextField)root.lookup("#fxName");
		TextField id = (TextField)root.lookup("#fxID");
		TextField pwd = (TextField)root.lookup("#fxPw");
		
		if(name.getText().isEmpty()) {
			alertMethod("이름은 필수 항목입니다");
			name.requestFocus();
			return;
		}
		else if(id.getText().isEmpty()) {
			alertMethod("아이디는 필수 항목입니다");
			return;
		}
		else if(pwd.getText().isEmpty()) {
			alertMethod("비밀번호는 필수 입력사항입니다");
			return;
		}
		
		MemberDTO dto = new MemberDTO();
		dto.setName( name.getText() );
		dto.setId( id.getText() );
		dto.setPw( pwd.getText() );
		
		int result = db.insert(dto);
		if(result == 1) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("회원가입에 성공하셨습니다");
			alert.show();
			return;}
		else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("동일한 아이디가 존재합니다");
			alert.show();
		}CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
	
	public void alertMethod(String msg) {
		Alert alert =new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
}
