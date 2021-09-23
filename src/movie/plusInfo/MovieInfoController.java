package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MovieInfoController implements Initializable{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void detailView(ActionEvent view ) {
		System.out.println(((Button)(view.getSource())).getId());
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("초인적인 능력을 가진 '텐 링즈'의 힘으로 수세기  동안 어둠의 세상을 지배해 온 '웬우' '샹치'는 아버지 '웬우' 밑에서 암살자로 훈련을 받지만 이를 거부하고 평범한 삶을 선택하는데...");
		arr.add("평소와 똑같던 어느 새벽, 서울 한복판에서 증거도, 목격자도 없이 대한민국 톱배우 '황정민'이 납치된다. 한 치 앞을 알 수 없는 상황 속 살기 위한 극한의 탈주가 시작되는데… ");
		arr.add("인간들의 마을에서 멀리 떨어진 포켓몬들의 낙원 자부숲에서 엄격한 법도를 지키며 무리들과 함께 살아가던 ‘자루도’는 우연히 강가에서 인간의 아이를 발견하게 되는데...");
		arr.add("내전으로 고립된 낯선 도시, 모가디슈 지금부터 우리의 목표는 오로지 생존이다! 대한민국이 UN가입을 위해 동분서주하던 시기 1991년 소말리아의 수도 모가디슈에서는 일촉즉발의 내전이 일어나는데...");
		arr.add("남다른 유전자와 조기교육으로 완성된 혈중 액션농도 100%! 영앤스트롱 킬러 ‘샘’ 15년 전, 업계에서 홀연히 사라졌던 실패율 0% 킬러이자 ‘샘’의 엄마 ‘스칼렛’ 폭발적 지성이 잠들어 있는 시크릿 에이전시, ‘도서관’의 ‘킬’사부일체 3인방! ");
		arr.add("끔찍한 일이 벌어졌던 그날 밤 이후, 비밀스러운 과거를 가진 소녀 ‘피닉스’와 함께 세상과 단절된 일상을 보내던 눈 먼 노인 ‘노먼’ 어느 날 밤, 정체불명의 괴한들이 침입해 ‘피닉스’를 납치하고 소녀를 되찾기 위해 잠들어있던 그의 광기가 다시 깨어나는데… ");
		
		ArrayList<String> btn = new ArrayList<String>();
		btn.add("detail0");
		btn.add("detail1");
		btn.add("detail2");
		btn.add("detail3");
		btn.add("detail4");
		btn.add("detail5");
		
		System.out.println(btn.indexOf(((Button)(view.getSource())).getId()));
//		Zero(arr.get(btn.indexOf(((Button)(view.getSource())).getId())));
		
		
		System.out.println(((Button)(view.getSource())).getId());
		ArrayList<String> outline = new ArrayList<String>();
		outline.add("액션");
		outline.add("액션");
		outline.add("애니메이션");
		outline.add("액션");
		outline.add("액션");
		outline.add("범죄");
		System.out.println(btn.indexOf(((Button)(view.getSource())).getId()));
		//Zero(outline.get(btn.indexOf(((Button)(view.getSource())).getId())));
		
		
		ArrayList chart1 = new ArrayList();
		chart1.add("pChart0");
		chart1.add("pChart1");
		chart1.add("pChart2");
		chart1.add("pChart3");
		chart1.add("pChart4");
		chart1.add("pChart5");
		System.out.println(chart1.indexOf(((Button)(view.getSource())).getId()));
//		Zero(arr.get(btn.indexOf(((Button)(view.getSource())).getId())));
		
		
		ArrayList chart2 = new ArrayList();
		chart2.add("bChart0");
		chart2.add("bChart1");
		chart2.add("bChart2");
		chart2.add("bChart3");
		chart2.add("bChart4");
		chart2.add("bChart5");
		System.out.println(chart2.indexOf(((Button)(view.getSource())).getId()));
//		Zero(arr.get(btn.indexOf(((Button)(view.getSource())).getId())));
		
		String[] o = {arr.get(btn.indexOf(((Button)(view.getSource())).getId())),outline.get(btn.indexOf(((Button)(view.getSource())).getId())) ,(btn.indexOf(((Button)(view.getSource())).getId()))+""};
		
		Zero(o);
	}
	public void Zero(String[] s){
//		System.out.println("111"+s);
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/movie/plusInfo/detailInfo0.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			datail_Info_Controller0 ctl = loader.getController();
			ctl.setRoot(Root,s);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void reserveBtn(){
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("/movie/plusInfo/plusInfo.fxml"));
			Parent Root = loader.load();
			Scene scene = new Scene(Root);
			plusInfo_Controller ctl = loader.getController();
			ctl.setRoot(Root);
			//Stage stage = (Stage)root.getScene().getWindow();
			//stage.close();
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}