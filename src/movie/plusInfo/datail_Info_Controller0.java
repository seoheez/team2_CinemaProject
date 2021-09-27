package movie.plusInfo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;

public class datail_Info_Controller0 implements Initializable{
	Parent root;
	PieChart pieChart;

	public void setRoot(Parent root,String[] s) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		chart(s[4]);
		Label a = (Label)root.lookup("#story");
		Label b = (Label)root.lookup("#outline");
		Label c = (Label)root.lookup("#rTime");
		Label d = (Label)root.lookup("#releaseD");
		a.setText(s[0]);
		b.setText(s[1]);
		c.setText(s[2]);
		d.setText(s[3]);
	}

	public void chart(String ss) {

		double[][] totalgender = {
				{ 53.7, 46.3},
				{ 44.3, 55.7},
				{ 39.1, 60.9},
				{ 42.6, 57.4},
				{ 51.8, 48.2},
				{ 44.8, 55.2} 
		};

		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", totalgender[Integer.parseInt(ss)][0]),
				new PieChart.Data("여성", totalgender[Integer.parseInt(ss)][1])
				));

	}

	public void detailCancel() {
		System.out.println("화면을 닫겠습니다");
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}
