package movie.plusInfo;

import javafx.beans.property.SimpleStringProperty;

public class movie {
	private SimpleStringProperty movieTitle;
	private SimpleStringProperty image;
	public movie(String smartPhone, String image) {
		this.movieTitle = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}
	public String getSmartPhone() {
		return movieTitle.get();
	}
	public void setSmartPhone(String smartPhone) {
		this.movieTitle = new SimpleStringProperty(smartPhone);
	}
	public String getImage() {
		return image.get();
	}
	public void setImage(String image) {
		this.image = new SimpleStringProperty(image);
	}
	
}
