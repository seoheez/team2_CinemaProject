package movie.plusInfo;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Main.mainClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.Chart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class plusInfo_Controller implements Initializable{

	PieChart pieChart;
	BarChart barChart;
	Parent root;
	ListView<String> fxListView;
	ImageView fxImageView;
	ObservableList<String> movieTitle;
	ArrayList<String> url;
	public void setRoot(Parent root) {
		this.root = root;
		fxListView = (ListView)root.lookup("#fxListView");
		fxImageView = (ImageView)root.lookup("#fxImageView");
		setListView();
		if(mainClass.s == 2) {
			pieChart = (PieChart)root.lookup("#pieChart");
			barChart = (BarChart)root.lookup("#barChart");
		chart();
			
		}
		mainClass.s += 1;
	}
	
	
	public void setListView() {
		if(mainClass.s == 0) {
			
			setList();
			
			fxListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue)->{
				System.out.println("observable(형식) : "+observable);
				System.out.println("oldValue(이전값) : "+oldValue);
				System.out.println("newValue(현재값) : "+newValue);
				System.out.println(movieTitle.get( (int)newValue ));
				System.out.println("/img/movie/"+ url.get( (int)newValue));
				System.out.println(url.size());
				fxImageView.setImage(new Image("/img/movie/"+ url.get( (int)newValue )) );
			});
		}
	}
	public void setList() {
		movieTitle = FXCollections.observableArrayList();
		url = new ArrayList<String>();
		String[] title = {"샹치","인질","포켓몬스터 :정글의 아이,코코","모가디슈","컨파우더 밀크셰이크","맨인더다크2"};
		for(int i=0 ; i<title.length; i++) {
		movieTitle.add(title[i]);
	
		url.add("movie"+ i + ".jpg");
	}
		if(mainClass.s == 0) {
			
			fxListView.setItems(movieTitle);
		}
}
	public void reserveBtn() {System.out.println("494" + mainClass.s);
			try {
				Stage primaryStage = new Stage();
				FXMLLoader loader = 
						new FXMLLoader(getClass().getResource("MovieInfo.fxml"));
				Parent Root = loader.load();
				Scene scene = new Scene(Root);
				plusInfo_Controller ctl = loader.getController();
				ctl.setRoot(Root);
				Stage stage = (Stage)root.getScene().getWindow();
				stage.close();
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	public void detailView() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = 
					new FXMLLoader(getClass().getResource("detailInfo.fxml"));
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
	
	public void chart() {
		
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("남성", 54.8),
				new PieChart.Data("여성", 45.2)
				));

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
public void initialize(URL arg0, ResourceBundle arg1) {	}
}





