package CheckPage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class checkConfirmBox {
 
    static boolean answer;
 
    public static boolean display(String title, String msg){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("종료경고창");
        window.setMinWidth(250);
 
        Label label = new Label();
        label.setText(msg);
 
        Button yesButton = new Button("예");
        Button noButton = new Button("아니오");
 
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });
 
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
 
        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.showAndWait();
 
        return answer;
    }
}