package movie.plusInfo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sign.common.CommonService;
import sign.common.CommonServiceImpl;

public class datail_Info_Controller0 implements Initializable{
	Parent root;
	PieChart pieChart;
	BarChart barChart;

	public void setRoot(Parent root,String[] s) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
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

		double[][] totalGender = {
				{ 53.7, 46.3},
				{ 44.3, 55.7},
				{ 39.1, 60.9},
				{ 42.6, 57.4},
				{ 51.8, 48.2},
				{ 44.8, 55.2} 
		};

		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", totalGender[Integer.parseInt(ss)][0]),
				new PieChart.Data("여성", totalGender[Integer.parseInt(ss)][1])
				));


		int[][] totalAge= {

				{4, 41, 40, 14, 2},
				{4, 35, 40, 15, 5},
				{12, 12, 38, 38, 0},
				{3, 41, 39, 13, 4},
				{0, 56, 22, 19, 3},
				{0, 48, 40, 2, 10}

		};
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("연령별 예매 분포");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data("10대", totalAge[Integer.parseInt(ss)][0]),
				new XYChart.Data("20대", totalAge[Integer.parseInt(ss)][1]),
				new XYChart.Data("30대", totalAge[Integer.parseInt(ss)][2]),
				new XYChart.Data("40대", totalAge[Integer.parseInt(ss)][3]),
				new XYChart.Data("50대", totalAge[Integer.parseInt(ss)][4])

				));
		barChart.getData().add(series1);
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
