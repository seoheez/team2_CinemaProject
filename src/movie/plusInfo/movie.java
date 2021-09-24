package movie.plusInfo;

import javafx.beans.property.SimpleStringProperty;

public class movie {
	private SimpleStringProperty movieTitle;
	private SimpleStringProperty image;
	public movie(String movieTitle, String image) {
		this.movieTitle = new SimpleStringProperty(movieTitle);
		this.image = new SimpleStringProperty(image);
	}
	public String getmovieTitle() {
		return movieTitle.get();
	}
	public void setmovieTitle(String movieTitle) {
		this.movieTitle = new SimpleStringProperty(movieTitle);
	}
	public String getImage() {
		return image.get();
	}
	public void setImage(String image) {
		this.image = new SimpleStringProperty(image);
	}
	
}
