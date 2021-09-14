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
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if(cmbAge != null) {
			cmbAge.getItems().addAll("20�̸�", "20��", "30��","40�� �̻�");
		}
	}
	public void memberCancle() {
		System.out.println("��� Ŭ��");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	public void check() {
		TextField tx = (TextField)root.lookup("#fxName");
		TextField pf = (TextField)root.lookup("#fxPw");
		if(tx.getText().isEmpty()) {
			alertMethod("�̸��� �ʼ� �׸��Դϴ�");
			tx.requestFocus();
		}
		else if(pf.getText().isEmpty()) {
			alertMethod("��й�ȣ �ʼ� �׸��Դϴ�");
		}
	}
	public void alertMethod(String msg) {
		Alert alert =new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
	public String getComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		String age = null;
		if(cmbAge.getValue() == null) {
			System.out.println("�޺��ڽ��� �������ּ���");
		}else {
			age = cmbAge.getValue().toString();
		}
		return age;
	}
	public boolean getGender() {
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		if( rdoMan.isSelected() ) return true;
		else return false;
	}
	@Override
	public void membershipProc() {
		MemberDTO dto = new MemberDTO();

		check();

		dto.setName( ((TextField)root.lookup("#fxName")).getText() );
		dto.setAge( getComboBox() );
		dto.setGender( getGender() );

		System.out.println( dto.getName() );
		System.out.println( dto.getAge() );
	}
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
}
