package CheckPage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import sign.loginService.LoginService;
import sign.member.MemberProc;

public class check_Controller implements Initializable{
	Parent root;
	Label fxTitle, fxTime, fxPCount, fxSNum, fxDate;
	public void setRoot(Parent root,String title, String time, String count, String date,String num) {
		this.root = root;
		fxTitle = (Label)root.lookup("#fxTitle");
		fxTime = (Label)root.lookup("#fxTime");
		fxPCount = (Label)root.lookup("#fxPCount");
		fxSNum	 = (Label)root.lookup("#fxSNum");
		fxDate = (Label)root.lookup("#fxDate");
		fxTitle.setText(title);
		fxTime.setText(time);
		fxPCount.setText(count);
		fxSNum.setText(date);
		fxDate.setText(num);
		
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
