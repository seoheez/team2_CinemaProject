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
	}
	public void detailCancel() {
		CommonService cs = new CommonServiceImpl();
		cs.setRoot(root);
		cs.windowClose();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}
