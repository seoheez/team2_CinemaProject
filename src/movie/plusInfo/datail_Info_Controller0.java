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

public class datail_Info_Controller0 implements Initializable{
	Parent root;
	PieChart pieChart;
	BarChart barChart;
	
	public void setRoot(Parent root,String[] s) {
		this.root = root;
		pieChart = (PieChart)root.lookup("#pieChart");
		barChart = (BarChart)root.lookup("#barChart");
		chart(s[3]);
		Label a = (Label)root.lookup("#story");
		Label b = (Label)root.lookup("#outline");
		Label c = (Label)root.lookup("#rTime");
		a.setText(s[0]);
		b.setText(s[1]);
		c.setText(s[2]);
	}
	
public void chart(String ss) {
		double[] gender0 = { 53.7, 46.3};//샹치
		double[] gender1 = { 44.3, 55.7};//인질
		double[] gender2 = { 39.1, 60.9};//포켓몬스터
		double[] gender3 = { 42.6, 57.4};//모가디슈
		double[] gender4 = { 51.8, 48.2};//건파우더
		double[] gender5 = { 44.8, 55.2};//맨인더다크2
		
		//반복문 생각하기
		if(ss.equals("0"))
		{pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", gender0[0]),
				new PieChart.Data("여성", gender0[1])
				));}
		if(ss.equals("1"))
		{pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", gender1[0]),
				new PieChart.Data("여성", gender1[1])
				));}
		if(ss.equals("2"))
		{pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", gender2[0]),
				new PieChart.Data("여성", gender2[1])
				));}
		if(ss.equals("3"))
		{pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", gender3[0]),
				new PieChart.Data("여성", gender3[1])
				));}
		if(ss.equals("4"))
		{pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", gender4[0]),
				new PieChart.Data("여성", gender4[1])
				));}
		if(ss.equals("5"))
		{pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", gender5[0]),
				new PieChart.Data("여성", gender5[1])
				));}
		
			
		XYChart.Series series1 = new XYChart.Series();
		series1.setName("연령별 예매 분포");
		series1.setData(FXCollections.observableArrayList(
					new XYChart.Data("10대",2.30),
					new XYChart.Data("20대",33.30),
					new XYChart.Data("30대",33.70),
					new XYChart.Data("40대",20.30),
					new XYChart.Data("50대",10.40)
				));
		barChart.getData().add(series1);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
