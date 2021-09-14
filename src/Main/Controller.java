package Main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sign.loginService.LoginService;
import sign.loginService.LoginServiceImpl;
import sign.member.MemberProc;

public class Controller implements Initializable{
   @FXML
   
   ImageView myImageView;
   Image myImage = new Image(getClass().getResourceAsStream("/img/movie.jpg"));
   
   Parent root;
   MemberProc mp;
   LoginService ls;
   
   public void setRoot(Parent root) {
      this.root = root;
      ls.setRoot(root);
   }
   
   public void btnOk() {
      //System.out.println("ok");
      ls.loginCheck();
   }
   public void btnCancel() {
      //System.out.println("can");
      ls.loginClose();
   }
   public void btnMemberShip() {
      //System.out.println("mem");
      mp.memberShip();
   }
   
   @Override
   public void initialize(URL arg0, ResourceBundle arg1) {
      mp = new MemberProc();
      ls = new LoginServiceImpl();
      
   }
   public void displayImage() {
      myImageView.setImage(myImage);
   }
}