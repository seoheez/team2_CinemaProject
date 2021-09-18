package movie.plusInfo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class datail_Info_Controller1 implements Initializable{
	Parent root;
	PieChart pieChart;
	BarChart barChart;

	public void setRoot(Parent root) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
		chart();
	}
	
public void chart() {
		
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", 14.8),
				new PieChart.Data("여성", 25.2)
				));

		XYChart.Series series1 = new XYChart.Series();
		series1.setName("연령별 예매 분포");
		series1.setData(FXCollections.observableArrayList(
					new XYChart.Data("10대",7.30),
					new XYChart.Data("20대",27.30),
					new XYChart.Data("30대",33.70),
					new XYChart.Data("40대",15.30),
					new XYChart.Data("50대",15.40)
				));
	
		barChart.getData().add(series1);
	}

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
